package patterns.command.commands;

import patterns.command.hardware.*;

public class LuzesDaSalaDesliga implements Comando {
    LuzesDaSala luzesDaSala;

    public LuzesDaSalaDesliga(LuzesDaSala luzesDaSala) {
        this.luzesDaSala= luzesDaSala;
    }

    @Override
    public void execute() {
        luzesDaSala.off();
    }

}
