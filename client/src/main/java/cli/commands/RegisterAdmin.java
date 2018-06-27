package cli.commands;

import api.TCFPublicAPI;
import cli.framework.Command;
import java.util.List;

public class RegisterAdmin extends Command<TCFPublicAPI> {

    private String adminName;
    private String adminPassword;
    private String adminMail;

    @Override
    public String identifier() { return "createAdminAccount"; }

    @Override
    public void load(List<String> args) {
        adminName = args.get(0);
        adminMail = args.get(1);
        adminPassword = args.get(2);
    }

    @Override
    public void execute() throws Exception {
        shell.system.acs.register(adminName, adminMail, adminPassword);
    }

    @Override
    public String describe() {
        return "Register an admin in the CoD backend (register ADMIN_NAME ADMIN_MAIL ADMIN_PASSWORD)";
    }
}
