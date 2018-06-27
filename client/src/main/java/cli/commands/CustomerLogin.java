package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;
import cli.session.StoreSession;

import java.util.List;

public class CustomerLogin extends Command<TCFPublicAPI> {

    private String customerName;
    private String customerPassword;


    @Override
    public String identifier() { return "login"; }

    @Override
    public void load(List<String> args) {
        customerName = args.get(0);
        customerPassword = args.get(1);
    }

    @Override
    public void execute() throws Exception {
        System.out.println("login avant: "+StoreSession.currentAccount);
        shell.system.ccs.login(customerName, customerPassword);
        StoreSession.currentAccount=customerName;
        System.out.println("login marche : "+StoreSession.currentAccount);
    }

    @Override
    public String describe() {
        return "login as a customer(addMoney CUSTOMER_NAME CUSTOMER_PASSWORD)";
    }
}
