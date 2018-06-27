package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;
import java.util.List;

public class RegisterTrader extends Command<TCFPublicAPI> {

    private String traderName;
    private String traderPassword;
    private String traderMail;
    private String traderAddress;

    @Override
    public String identifier() { return "createTraderAccount"; }

    @Override
    public void load(List<String> args) {
        traderName = args.get(0);
        traderAddress = args.get(1);
        traderMail = args.get(2);
        traderPassword = args.get(3);
    }

    @Override
    public void execute() throws Exception {
        shell.system.tcs.register(traderName, traderAddress, traderMail, traderPassword);
    }

    @Override
    public String describe() {
        return "Register a trader in the CoD backend (register TRADER_NAME TRADER_ADDRESS TRADER_MAIL TRADER_PASSWORD)";
    }
}
