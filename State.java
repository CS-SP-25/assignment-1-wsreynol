public abstract class State {
    protected SalesTaxBehavior stb;
    // attributes
    private String name;
    // accessor
    String getName() { return name; }
    // mutator
    public void setName(String name) { this.name = name; }
    public void setSalesTaxBehavior(SalesTaxBehavior stb) { this.stb = stb; }
    // display
    public void showTax(double value) {
        System.out.printf("The sales tax on $%.2f in %s is $%.2f\n", value, name, stb.compute(value));
    }
}
