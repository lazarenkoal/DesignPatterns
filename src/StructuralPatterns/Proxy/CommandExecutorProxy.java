package StructuralPatterns.Proxy;

/**
 * This class restricts the functionality of command executor
 * <p>
 * Created by aleksandrlazarenko on 31.03.16.
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("Pankaj".equals(user) && "J@urnalD$v".equals(pwd))
            isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm is only for admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
