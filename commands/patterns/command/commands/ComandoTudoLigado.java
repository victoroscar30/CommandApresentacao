package patterns.command.commands;

import patterns.command.hardware.*;

public class ComandoTudoLigado implements Comando {
    Music music;
    LuzesDaSala luzesDaSala;
    Persianas persianas;

    public ComandoTudoLigado(Music music, LuzesDaSala luzesDaSala, Persianas persianas) {
        this.music = music;
        this.luzesDaSala = luzesDaSala;
        this.persianas = persianas;
    }

    @Override
    public void execute() {
        System.out.println("--- HORA DO JOGO! ---");
        luzesDaSala.on();
        music.on();
        persianas.on();
        music.setVolume(10);
        music.setconfiguracaoDeAudio("Modo Jogo");
    }

}
