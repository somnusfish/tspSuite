package test.junit.org.logisticPlanning.tsp.solving.utils.edgeData;

/**
 * Testing a configuration of the EdgeNumber facility.
 */
public class AsymmetricEdgeShort_1_13 extends _EdgeNumberTest {

  /** create the AsymmetricEdgeShort_1_13 */
  public AsymmetricEdgeShort_1_13() {
    super();
  }

  /** {@inheritDoc} */
  @Override
  final boolean isSymmetric() {
    return false;
  }

  /** {@inheritDoc} */
  @Override
  final int n() {
    return 13;
  }

  /** {@inheritDoc} */
  @Override
  final long getMaxValue() {
    return ((java.lang.Short.MAX_VALUE) + (1l));
  }

  /** {@inheritDoc} */
  @Override
  final int floatType() {
    return 0;
  }

}
