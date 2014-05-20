package xgen.converters;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class GrammarValueConverters extends Ecore2XtextTerminalConverters {

	@ValueConverter(rule = "CHAR")
	public IValueConverter<Character> CHAR() {
		return new IValueConverter<Character>() {
			private IValueConverter<String> stringValueConverter = STRING();

			@Override
			public Character toValue(String string, INode node)
					throws ValueConverterException {
				return stringValueConverter.toValue(string, node).charAt(0);
			}

			@Override
			public String toString(Character value)
					throws ValueConverterException {
				return stringValueConverter.toString(Character.toString(value));
			}
		};
	}
}
