public class NoTax implements SalesTaxBehavior {
    // ignore value and return 0
    public Double compute(Double value) {
        return 0d;
    }
}
