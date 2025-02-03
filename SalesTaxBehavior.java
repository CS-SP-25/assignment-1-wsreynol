public interface SalesTaxBehavior {
    // compute will take a value and return a percent
    // of the supplied value based on its implementation
    Double compute(Double value);
}
