package patterns.command.commands;

import patterns.command.hardware.Music;

public class MusicOffCommand implements Comando {
    Music music;

    public MusicOffCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.setVolume(0);
        music.setconfiguracaoDeAudio(" Modo TV");
        music.off();
    }

}
