package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;

import java.util.List;

public class AddItem extends Command<TCFPublicAPI> {

    protected boolean badArgs = false;

    protected String customerName;
    protected int quantity;
    protected String name;
    protected String description;
    protected String image;
    protected boolean gift;
    protected boolean VUP;
    protected double price;
    protected int points;

    @Override
    public String identifier() { return "addItem"; }

    @Override
    public void execute() throws Exception {
        if (!badArgs) {
            shell.system.cata.addItemToCatalogue(customerName, quantity, name, description, image, VUP, gift, price, points);
        }
    }

    @Override
    public String describe() {
        return "Add a advantage to the catalogue for a given customer (add CUSTOMER_NAME QUANTITY NAME DESCRIPTION IMAGE GIFT VUP PRICE POINTS)";
    }

    @Override
    public void load(List<String> args) {
        if(args.size() == 9) {
            customerName = args.get(0);
            quantity = Integer.parseInt(args.get(1));
            name = args.get(2);
            description = args.get(3);
            image = args.get(4);
            VUP = Boolean.parseBoolean(args.get(5));
            gift = Boolean.parseBoolean(args.get(6));
            price = Double.parseDouble(args.get(7));
            points = Integer.parseInt(args.get(8));
        } else {
            badArgs = true;
            System.out.println("Illegal arguments for command addItem !");
        }
    }

}