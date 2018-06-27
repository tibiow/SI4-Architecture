package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;

import java.util.List;

public class ModifyItem extends Command<TCFPublicAPI> {

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
    protected int id;

    @Override
    public String identifier() { return "modifyItem"; }

    @Override
    public void execute() throws Exception {
        if (!badArgs) {
            shell.system.cata.modifyItemToCatalogue(customerName, quantity, name, description, image, VUP, gift, price, points, id);
        }
    }

    @Override
    public String describe() {
        return "Modify a advantage to the catalogue for a given customer (modify CUSTOMER_NAME QUANTITY NAME DESCRIPTION IMAGE GIFT VUP PRICE POINTS ID)";
    }

    @Override
    public void load(List<String> args) {
        if(args.size() == 10) {
            customerName = args.get(0);
            quantity = Integer.parseInt(args.get(1));
            name = args.get(2);
            description = args.get(3);
            image = args.get(4);
            VUP = Boolean.parseBoolean(args.get(5));
            gift = Boolean.parseBoolean(args.get(6));
            price = Double.parseDouble(args.get(7));
            points = Integer.parseInt(args.get(8));
            id = Integer.parseInt(args.get(9));
        } else {
            badArgs = true;
            System.out.println("Illegal arguments for command modifyItem !");
        }
    }

}