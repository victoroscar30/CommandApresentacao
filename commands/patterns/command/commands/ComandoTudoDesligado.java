package patterns.command.commands;

import patterns.command.hardware.*;

public class ComandoTudoDesligado implements Comando {
    Music music;
    LuzesDaSala luzesDaSala;
    Persianas persianas;

    public ComandoTudoDesligado(Music music, LuzesDaSala luzesDaSala, Persianas persianas) {
        this.music = music;
        this.luzesDaSala = luzesDaSala;
        this.persianas = persianas;
    }

    @Override
    public void execute() {
        System.out.println("--- FIM DO JOGO! ---");
        luzesDaSala.off();
        music.off();
        persianas.off();
        music.setVolume(0);
        music.setconfiguracaoDeAudio("Modo TV");
    }

}
