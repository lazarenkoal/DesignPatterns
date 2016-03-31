package StructuralPatterns.Proxy;

/**
 * Interface and a main class for proxy
 *
 * Created by aleksandrlazarenko on 31.03.16.
 */
interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}

class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}