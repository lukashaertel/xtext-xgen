package xgen.output;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ApplicationOutput
{
	public static void print(String consoleName, ImageDescriptor imageDescriptor, Consumer<MessageConsoleStream> printer)
	{
		// Get manager
		final IConsoleManager cm = ConsolePlugin.getDefault().getConsoleManager();

		// Find a console
		MessageConsole simulationOutput = null;
		for (IConsole console : cm.getConsoles())
		{
			if (!(console instanceof MessageConsole))
				continue;

			if (Objects.equals(consoleName, console.getName()))
			{
				simulationOutput = (MessageConsole) console;
				break;
			}
		}

		// Or create it
		if (simulationOutput == null)
			simulationOutput = new MessageConsole(consoleName, imageDescriptor);

		// Add and show it
		cm.addConsoles(new IConsole[] { simulationOutput });
		cm.showConsoleView(simulationOutput);

		// Print to it
		try (MessageConsoleStream simulationOutputStream = new MessageConsoleStream(simulationOutput))
		{
			printer.accept(simulationOutputStream);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}
}
