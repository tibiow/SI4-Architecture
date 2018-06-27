package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;

import java.util.List;

public class RegisterCustomer extends Command<TCFPublicAPI> {

	protected boolean badArgs = false;

	private String customerName;
	private String customerPassword;
	private String customerMail;
	private String customerAddress;
    private boolean vup;

	@Override
	public String identifier() { return "createUserAccount"; }

    @Override
    public void load(List<String> args) {
        if(args.size() == 5) {
            customerName = args.get(0);
            customerAddress = args.get(1);
            customerMail = args.get(2);
            customerPassword = args.get(3);
            vup = Boolean.parseBoolean(args.get(4));
        } else {
            badArgs = true;
            System.out.println("Illegal arguments for command createUserAccount !");
        }
    }

	@Override
	public void execute() throws Exception {
		if(!badArgs) {
			shell.system.ccs.register(customerName, customerAddress, customerMail, customerPassword, vup);
		}
	}

	@Override
	public String describe() {
		return "Register a customer in the CoD backend (register CUSTOMER_NAME CUSTOMER_ADRESS CUSTOMER_MAIL CUSTOMER_PASSWORD VUP)";
	}
}
