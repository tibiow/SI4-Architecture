import cli.commands.*;
import cli.commands.AddMoney;
import cli.commands.Pay;
import cli.framework.Shell;
import api.TCFPublicAPI;

/**
 * An Interactive shell that interacts with a Cookie on Demand instance
 * Use -Dexec.args="IP_ADDRESS PORT_NUMBER" to change host/port parameters
 */
public class Main extends Shell<TCFPublicAPI> {

	public Main(String host, String port) {

		this.system  = new TCFPublicAPI(host, port);
		this.invite  = "CoD";

		// Registering the command available for the user
		register(
				Pay.class,
				AddMoney.class,
				// Getting out of here
				Bye.class,
				// Handling customer
				RegisterCustomer.class,
				// Catalogue managment
				SeeItems.class, AddItem.class, RemoveItem.class, ModifyItem.class,
				// Cart management
				SeeAdvantages.class, AddAdvantage.class, UseAdvantage.class,
				// Play capability
				Play.class,
                // Handling admin
                RegisterAdmin.class,
                // Handling trader
                RegisterTrader.class,

				CustomerLogin.class
		);
	}

	public static void main(String[] args) {
		String host = ( args.length == 0 ? "localhost" : args[0] );
		String port = ( args.length < 2  ? "8080"      : args[1] );
		System.out.println("\n\nStarting");
		System.out.println("  - Remote server: " + host);
		System.out.println("  - Port number:   " + port);
		Main main = new Main(host, port);
		main.run();
		System.out.println("Exiting\n\n");
	}

}
