package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;
import stubs.catalogue.Item;

import java.util.List;

public class SeeItems extends Command<TCFPublicAPI> {

	protected boolean badArgs = false;

	protected String customerName;

	@Override
	public String identifier() { return "seeItems"; }

	@Override
	public void execute() throws Exception {
		if (!badArgs) {
			List<Item> offers = shell.system.cata.listAllItems(customerName);
			if (offers.isEmpty()) {
				System.out.println("No items !");
			} else {
				for (Item i : offers) {
					System.out.print(toStringOffer(i));
					System.out.println("\t\tQuantity : " + i.getQuantity() + "\n");
				}
			}
		}
	}

	@Override
	public String describe() {
	return "List all available items (see CUSTOMER_NAME)";
	}

	@Override
	public void load(List<String> args) {
		if(args.size() == 1) {
			customerName = args.get(0);
		} else {
			badArgs = true;
			System.out.println("Illegal arguments for command seeItem !");
		}
	}

	public String toStringOffer(Item o) {
		String str = "- Item n°" +  o.getId() + " :\n\tnom : " + o.getOffer().getName() + " :\n\tdescription : " + o.getOffer().getDescription() + "\n\timage : " + o.getOffer().getImage() + "\n";
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
