package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;

import java.util.List;

public class AddAdvantage extends Command<TCFPublicAPI> {

	protected boolean badArgs = false;

	protected String customerName;
	protected int quantity;
	protected int id;

	@Override
	public String identifier() { return "addAdvantage"; }

	@Override
	public void execute() throws Exception {
		if (!badArgs) {
			shell.system.carts.addAdvantageToCustomerCart(customerName, quantity, id);
		}
	}

	@Override
	public String describe() {
		return "Add a advantage for a given customer (add CUSTOMER_NAME QUANTITY ID)";
	}

	@Override
	public void load(List<String> args) {
		if(args.size() == 3) {
			customerName = args.get(0);
			quantity = Integer.parseInt(args.get(1));
			id = Integer.parseInt(args.get(2));
		} else {
			badArgs = true;
			System.out.println("Illegal arguments for command addAdvantage !");
		}
	}

}