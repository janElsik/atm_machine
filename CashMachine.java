package atm_machine;

import atm_machine.command.CommandExecutor;
import atm_machine.exception.InterruptedOperationException;

import java.util.Locale;

public class CashMachine {
    public static final String RESOURCE_PATH = CashMachine.class.getPackage().getName() + ".resources.";

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try {
            Operation operation = Operation.LOGIN;
            CommandExecutor.execute(operation);
        do {
            operation = ConsoleHelper.requestOperation();
            CommandExecutor.execute(operation);
        } while (operation != Operation.EXIT);
        } catch (InterruptedOperationException ignored) {
            ConsoleHelper.printExitMessage();
        }
    }
}
