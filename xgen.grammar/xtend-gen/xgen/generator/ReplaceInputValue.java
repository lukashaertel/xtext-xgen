/**
 * generated by Xtext
 */
package xgen.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import xgen.parsetree.Leaf;
import xgen.postprocess.TransformAll;

@SuppressWarnings("all")
public class ReplaceInputValue extends TransformAll {
  private int i = 0;
  
  private List<String> j = Collections.<String>unmodifiableList(Lists.<String>newArrayList("SomeInput", "MoreInput", "SlightlyDifferentInput", "EvenMore"));
  
  protected Leaf transform(final Leaf it) {
    boolean _notEquals = (!Objects.equal(it.value, "<input value>"));
    if (_notEquals) {
      return it;
    }
    int _size = this.j.size();
    int _modulo = (this.i % _size);
    final String r = this.j.get(_modulo);
    int _plus = (this.i + 1);
    this.i = _plus;
    Leaf _leaf = new Leaf(r);
    return _leaf;
  }
}