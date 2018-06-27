package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;
import stubs.cart.Advantage;
import java.util.List;

public class SeeAdvantages extends Command<TCFPublicAPI> {

	protected boolean badArgs = false;

	private String customerName;

	@Override
	public String identifier() { return "seeAdvantages"; }

	@Override
	public void execute() throws Exception {
		if(!badArgs) {
			List<Advantage> cart = shell.system.carts.getCustomerCartContents(customerName);
			if (cart.isEmpty()) {
				System.out.println("No advantage !");
			} else {
				System.out.println("List of " + customerName + "\'s advantages :");
				for (Advantage i : cart) {
					System.out.print(toStringOffer(i));
					System.out.println("\t\tQuantity : " + i.getQuantity() + "\n");
				}
			}
		}

	}

	@Override
	public void load(List<String> args) {
		if(args.size() == 1) {
			customerName = args.get(0);
		} else {
			badArgs = true;
			System.out.println("Illegal arguments for command seeAdvantages !");
		}

	}

	@Override
	public String describe() {
		return "Show the advantage for a given customer (see CUSTOMER_NAME)";
	}

	public String toStringOffer(Advantage o) {
		String str = "- Advantage n°" +  o.getId() + " :\n\tnom : " + o.getOffer().getName() + " :\n\tdescription : " + o.getOffer().getDescription() + "\n\timage : " + o.getOffer().getImage() + "\n";
		// VUP
		if(o.getOffer().isVUP()) {str = str + "\tAccessible que pour les VUP !\n";}
		else {str = str + "\tAccessible pour tous !\n";}
		// Gift
		if(o.getOffer().isGift()) {str = str + "\tArticle en cadeau !\n";}
		else {str = str + "\tArticle en Promotion !\n";}
		str = str + "\tPrix : " + o.getOffer().getPrice() + "\n";
		str = str + "\tPoints : " + o.getOffer().getPoints() + "\n";
		return str;
	}
}
