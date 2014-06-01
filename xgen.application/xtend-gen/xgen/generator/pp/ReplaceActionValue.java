package xgen.generator.pp;

import com.google.common.base.Objects;
import xgen.parsetree.Leaf;
import xgen.parsetree.Pair;
import xgen.postprocess.TransformAll;

@SuppressWarnings("all")
public class ReplaceActionValue extends TransformAll<Object,Integer,Object> {
  protected Object finalizeCarrier(final Integer c) {
    return c;
  }
  
  protected Integer supplyCarrier(final Object s) {
    return Integer.valueOf(0);
  }
  
  protected Pair<Integer,Leaf> transformOneLeaf(final Pair<Integer,Leaf> p) {
    boolean _notEquals = (!Objects.equal(p.b.value, "<action value>"));
    if (_notEquals) {
      return p;
    }
    int _plus = ((p.a).intValue() + 1);
    String _plus_1 = ("Action" + p.a);
    Leaf _leaf = new Leaf(p.b.label, _plus_1);
    return Pair.<Integer, Leaf>create(Integer.valueOf(_plus), _leaf);
  }
}
