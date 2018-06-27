package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;
import java.util.List;

public class AddMoney extends Command<TCFPublicAPI> {

    private String customerName;
    private int customerMoney;


    @Override
    public String identifier() { return "addMoney"; }

    @Override
    public void load(List<String> args) {
        customerName = args.get(0);
        customerMoney = Integer.parseInt(args.get(1));
    }

    @Override
    public void execute() throws Exception {
        shell.system.ccs.addMoney(customerName, customerMoney);
    }

    @Override
    public String describe() {
        return "add money to a customer(addMoney CUSTOMER_NAME CUSTOMER_MONEY)";
    }
}
