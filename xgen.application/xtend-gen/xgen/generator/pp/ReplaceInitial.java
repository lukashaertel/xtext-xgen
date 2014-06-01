package xgen.generator.pp;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import xgen.parsetree.Leaf;
import xgen.parsetree.Pair;
import xgen.postprocess.ForEachBranch;

@SuppressWarnings("all")
public class ReplaceInitial extends ForEachBranch<Object,Object,Object> {
  protected boolean select(final Leaf leaf) {
    boolean _equals = Objects.equal(leaf.value, "<initial>");
    return _equals;
  }
  
  protected Object finalizeCarrier(final Object c) {
    return c;
  }
  
  /**
   * s
   */
  protected Object supplyCarrier(final Object s) {
    return s;
  }
  
  protected Pair<Object,Leaf> transformOneLeaf(final Pair<Object,Leaf> p) {
    final Function<Leaf,Leaf> _function = new Function<Leaf,Leaf>() {
      public Leaf apply(final Leaf it) {
        Leaf _leaf = new Leaf(it.label, "initial");
        return _leaf;
      }
    };
    Pair<Object,Leaf> _mapB = p.<Leaf>mapB(_function);
    return _mapB;
  }
}
