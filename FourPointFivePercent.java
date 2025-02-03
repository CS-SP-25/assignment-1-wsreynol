public class FourPointFivePercent implements SalesTaxBehavior {
    // return 4.5 percent of the supplied value
    public Double compute(Double value) {
        return value * 0.045d;
    }
}