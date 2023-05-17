package patterns.command.commands;

import patterns.command.hardware.Persianas;

public class PersianasFechadas implements Comando {
    Persianas persianas;

    public PersianasFechadas(Persianas persianas) {
        this.persianas= persianas;
    }

    @Override
    public void execute() {
        persianas.off();
    }
}