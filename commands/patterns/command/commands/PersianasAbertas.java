package patterns.command.commands;

import patterns.command.hardware.Persianas;

public class PersianasAbertas implements Comando {
    Persianas persianas;

    public PersianasAbertas(Persianas persianas) {
        this.persianas= persianas;
    }

    @Override
    public void execute() {
        persianas.on();
    }
}
