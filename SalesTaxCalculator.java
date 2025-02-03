public class SalesTaxCalculator {
    public static void main(String[] args) {
        try {
            // create a generic state to be instantiated upon user input
            State myState;
            if (args[0].compareTo("Alaska") == 0) {
                // instantiate the state to Alaska
                myState = new Alaska();
                // set the behavior of Alaska to NoTax
                myState.setSalesTaxBehavior(new NoTax());
                // calculate the tax for Alaska from arg 2
                myState.showTax(Double.parseDouble(args[1]));
            } else if (args[0].compareTo("Indiana") == 0) {
                // instantiate the state to Indiana
                myState = new Indiana();
                // set the behavior of Alaska to NoTax
                myState.setSalesTaxBehavior(new SevenPercent());
                // calculate the tax for Indiana from arg 2
                myState.showTax(Double.parseDouble(args[1]));
            } else if (args[0].compareTo("Hawaii") == 0) {
                // instantiate the state to Hawaii
                myState = new Hawaii();
                // set the behavior of Alaska to NoTax
                myState.setSalesTaxBehavior(new FourPointFivePercent());
                // calculate the tax for Hawaii from arg 2
                myState.showTax(Double.parseDouble(args[1]));
            } else {
                // a state or string other than IN an AK was supplied
                System.out.println("Unknown state: " + args[0]);
            }
        } catch (IndexOutOfBoundsException e) {
            // and incorrect number of command line arguments was
            // supplied causing a segmentation fault
            System.out.println("Invalid number of arguments.\n");
        }
    }
}
