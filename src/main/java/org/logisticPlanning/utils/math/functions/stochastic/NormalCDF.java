package org.logisticPlanning.utils.math.functions.stochastic;

import org.logisticPlanning.utils.math.MathConstants;
import org.logisticPlanning.utils.math.functions.UnaryFunction;
import org.logisticPlanning.utils.math.functions.special.ErrorFunction;

/**
 * <p>
 * The CDF of the normal distribution.
 * </p>
 * <h2>Inspiration</h2>
 * <p>
 * Some of the more complex mathematical routines in this package, such as
 * this class may have been inspired by &ndash; or derived from freely
 * available open source code in the internet (although this &quot;function
 * object&quot; idea is by a unique &quot;invention&quot; by myself).
 * Unfortunately, this has been a quite some time ago for personal use, so
 * I (<a href="mailto:tweise@gmx.de">Thomas Weise</a>) do not remember
 * anymore from where the original stems.
 * </p>
 * <p>
 * Also, most of the code has undergone quite a few revisions,
 * refactorings, and modifications, so it often is quite different from the
 * potential originals.
 * <p>
 * <p>
 * I vaguely remember that some code may have been inspired by the <a
 * href="https://commons.apache.org/proper/commons-math/">The Apache
 * Commons Mathematics Library</a>&nbsp;[<a href="#cite_A2013CMTACML"
 * style="font-weight:bold">1</a>] which is currently is licensed under <a
 * href="https://www.apache.org/licenses/">Apache License 2.0</a> which is
 * GPL compatible &ndash; but again, I am not sure anymore, it's too long
 * ago.
 * </p>
 * <p>
 * If you know the original source of this code or find a very similar
 * package, please let me know so that I can properly cite it. If you feel
 * that this code here somehow infringes your copyright, please let me know
 * as well and I will cease putting it online or replace it with different
 * code.<br/>
 * Many thanks.<br/>
 * Thomas.
 * </p>
 * <h2>References</h2>
 * <ol>
 * <li><div><span id="cite_A2013CMTACML" /><span
 * style="font-style:italic;font-family:cursive;">&ldquo;Commons Math: The
 * Apache Commons Mathematics Library,&rdquo;</span> (Website),
 * April&nbsp;7, 2013, Forest Hill, MD, USA: Apache Software Foundation.
 * <div>link: [<a
 * href="https://commons.apache.org/proper/commons-math/">1</
 * a>]</div></div></li>
 * </ol>
 */
public final class NormalCDF extends UnaryFunction {

  /** the serial version uid */
  private static final long serialVersionUID = 1L;

  /** the globally shared instance */
  public static final NormalCDF INSTANCE = new NormalCDF();

  /** instantiate */
  private NormalCDF() {
    super();
  }

  /** {@inheritDoc} */
  @Override
  public final double compute(final double x1) {
    if (x1 <= Double.NEGATIVE_INFINITY) {
      return 0d;
    }
    if (x1 >= Double.POSITIVE_INFINITY) {
      return 1d;
    }
    return 0.5d + (0.5d * ErrorFunction.INSTANCE.compute(x1
        / MathConstants.SQRT_2));
  }

  /** {@inheritDoc} */
  @Override
  public final NormalInvCDF invertFor(final int index) {
    return NormalInvCDF.INSTANCE;
  }

  //

  // default, automatic serialization replacement and resolve routines for
  // singletons
  //
  /**
   * Write replace: the instance this method is invoked on will be replaced
   * with the singleton instance {@link NormalCDF#INSTANCE
   * NormalCDF.INSTANCE} for serialization, i.e., when the instance is
   * written with {@link java.io.ObjectOutputStream#writeObject(Object)}.
   *
   * @return the replacement instance (always {@link NormalCDF#INSTANCE
   *         NormalCDF.INSTANCE})
   */
  private final Object writeReplace() {
    return NormalCDF.INSTANCE;
  }

  /**
   * Read resolve: The instance this method is invoked on will be replaced
   * with the singleton instance {@link NormalCDF#INSTANCE
   * NormalCDF.INSTANCE} after serialization, i.e., when the instance is
   * read with {@link java.io.ObjectInputStream#readObject()}.
   *
   * @return the replacement instance (always {@link NormalCDF#INSTANCE
   *         NormalCDF.INSTANCE})
   */
  private final Object readResolve() {
    return NormalCDF.INSTANCE;
  }

}
