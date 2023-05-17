package patterns.command.commands;

import patterns.command.hardware.*;

public class LuzesDaSalaLigada implements Comando {
    LuzesDaSala luzesDaSala;

    public LuzesDaSalaLigada(LuzesDaSala luzesDaSala) {
        this.luzesDaSala= luzesDaSala;
    }

    @Override
    public void execute() {
        luzesDaSala.on();
    }

}
