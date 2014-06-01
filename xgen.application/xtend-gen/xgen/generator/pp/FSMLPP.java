package xgen.generator.pp;

import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import xgen.generator.pp.NameStates;
import xgen.generator.pp.RemoveRemainingInitials;
import xgen.generator.pp.ReplaceActionValue;
import xgen.generator.pp.ReplaceInitial;
import xgen.generator.pp.ReplaceInputValue;
import xgen.generator.pp.UseStates;
import xgen.postprocess.PostProcessor;

@SuppressWarnings("all")
public class FSMLPP {
  public final static PostProcessor<Object,Set<String>> fsmlPP = new Function0<PostProcessor<Object,Set<String>>>() {
    public PostProcessor<Object,Set<String>> apply() {
      ReplaceInitial _replaceInitial = new ReplaceInitial();
      RemoveRemainingInitials _removeRemainingInitials = new RemoveRemainingInitials();
      PostProcessor<Object,Object> _andThen = _replaceInitial.<Object>andThen(_removeRemainingInitials);
      ReplaceInputValue _replaceInputValue = new ReplaceInputValue();
      PostProcessor<Object,Object> _andThen_1 = _andThen.<Object>andThen(_replaceInputValue);
      ReplaceActionValue _replaceActionValue = new ReplaceActionValue();
      PostProcessor<Object,Object> _andThen_2 = _andThen_1.<Object>andThen(_replaceActionValue);
      NameStates _nameStates = new NameStates();
      PostProcessor<Object,Set<String>> _andThen_3 = _andThen_2.<Set<String>>andThen(_nameStates);
      UseStates _useStates = new UseStates();
      PostProcessor<Object,Set<String>> _andThen_4 = _andThen_3.<Set<String>>andThen(_useStates);
      return _andThen_4;
    }
  }.apply();
}
