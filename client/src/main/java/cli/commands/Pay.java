package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;
import java.util.List;

public class Pay extends Command<TCFPublicAPI> {

    private String customerName;
    private int customerCost;


    @Override
    public String identifier() { return "pay"; }

    @Override
    public void load(List<String> args) {
        customerName = args.get(0);
        customerCost = Integer.parseInt(args.get(1));
    }

    @Override
    public void execute() throws Exception {
        shell.system.ccs.pay(customerName, customerCost);
    }

    @Override
    public String describe() {
        return "make the cuustomer pay a certain amount of money(pay CUSTOMER_NAME CUSTOMER_COST)";
    }
}
