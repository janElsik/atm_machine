package atm_machine.command;


import atm_machine.exception.InterruptedOperationException;

interface Command {
    void execute() throws InterruptedOperationException;
}
