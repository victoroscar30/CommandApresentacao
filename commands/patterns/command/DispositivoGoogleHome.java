package patterns.command;

import patterns.command.commands.Comando;
import patterns.command.commands.NoOpCommand;

public class DispositivoGoogleHome {
    Comando[] onCommands;
    Comando[] offCommands;
    int slots = 3;

    public DispositivoGoogleHome() {
        onCommands = new Comando[slots];
        offCommands = new Comando[slots];

        for (int i = 0; i < slots; i++) {
            onCommands[i] = new NoOpCommand();
            offCommands[i] = new NoOpCommand();
        }
    }

    public void setCommand(int slot, Comando onCommand, Comando offCommand) {
        //slot between 0..2, neither commands can be nll
        if (onCommand == null || offCommand == null) {
            throw new IllegalArgumentException("Commands cannot be null!");
        } else {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void activateSlot(int slot) {
        onCommands[slot].execute();
    }

    public void deactivateSlot(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------- Controle de Dispositivo Google Home --------\n");
        for (int i = 0; i < slots; i++) {
            sb.append("Slot #" + i + " - " + onCommands[i].getClass().getSimpleName() + "(" + onCommands.getClass().getSimpleName() + ")" +
                    " - " + offCommands[i].getClass().getSimpleName() + "(" + offCommands.getClass().getSimpleName() + ")" +
                    "\n");
        }
        return sb.toString();
    }
}
