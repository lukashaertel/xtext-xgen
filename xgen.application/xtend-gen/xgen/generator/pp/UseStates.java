package xgen.generator.pp;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import xgen.parsetree.Leaf;
import xgen.parsetree.Pair;
import xgen.postprocess.TransformAll;

@SuppressWarnings("all")
public class UseStates extends TransformAll<Set<String>,Set<String>,Set<String>> {
  protected Set<String> finalizeCarrier(final Set<String> c) {
    return c;
  }
  
  protected Set<String> supplyCarrier(final Set<String> s) {
    return s;
  }
  
  private final static Random ran = new Function0<Random>() {
    public Random apply() {
      Random _random = new Random();
      return _random;
    }
  }.apply();
  
  protected Pair<Set<String>,Leaf> transformOneLeaf(final Pair<Set<String>,Leaf> p) {
    boolean _notEquals = (!Objects.equal(p.b.value, "<state reference>"));
    if (_notEquals) {
      return p;
    }
    ArrayList<String> _arrayList = new ArrayList<String>(p.a);
    final ArrayList<String> cs = _arrayList;
    int _size = cs.size();
    int _nextInt = UseStates.ran.nextInt(_size);
    final String usn = cs.get(_nextInt);
    Leaf _leaf = new Leaf(p.b.label, usn);
    return Pair.<Set<String>, Leaf>create(
      p.a, _leaf);
  }
}
