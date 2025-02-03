public class SevenPercent implements SalesTaxBehavior {
    // return 7 percent of the supplied value
    public Double compute(Double value) {
        return value * 0.07d;
    }
}
