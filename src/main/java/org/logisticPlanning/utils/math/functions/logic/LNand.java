package org.logisticPlanning.utils.math.functions.logic;

/**
 * The logical nand.
 */
public final class LNand extends BinaryBooleanFunction {

  /** the serial version uid */
  private static final long serialVersionUID = 1L;

  /** the globally shared instance */
  public static final LNand INSTANCE = new LNand();

  /** the forbidden constructor */
  private LNand() {
    super();
  }

  /** {@inheritDoc} */
  @Override
  public final boolean compute(final boolean x1, final boolean x2) {
    return (!(x1 && x2));
  }

  /** {@inheritDoc} */
  @Override
  public final int lazyResultForFirstParam(final boolean x1) {
    return (x1 ? 0 : (1));
  }

  //

  // default, automatic serialization replacement and resolve routines for
  // singletons
  //
  /**
   * Write replace: the instance this method is invoked on will be replaced
   * with the singleton instance {@link LNand#INSTANCE LNand.INSTANCE} for
   * serialization, i.e., when the instance is written with
   * {@link java.io.ObjectOutputStream#writeObject(Object)}.
   *
   * @return the replacement instance (always {@link LNand#INSTANCE
   *         LNand.INSTANCE})
   */
  private final Object writeReplace() {
    return LNand.INSTANCE;
  }

  /**
   * Read resolve: The instance this method is invoked on will be replaced
   * with the singleton instance {@link LNand#INSTANCE LNand.INSTANCE}
   * after serialization, i.e., when the instance is read with
   * {@link java.io.ObjectInputStream#readObject()}.
   *
   * @return the replacement instance (always {@link LNand#INSTANCE
   *         LNand.INSTANCE})
   */
  private final Object readResolve() {
    return LNand.INSTANCE;
  }

}
