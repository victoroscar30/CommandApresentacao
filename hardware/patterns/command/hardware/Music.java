package patterns.command.hardware;

public class Music {
    private int volume;
    private String configuracaoDeAudio;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        System.out.println("Colocando o volume em " + volume);
        this.volume = volume;
    }

    public String getconfiguracaoDeAudio() {
        return configuracaoDeAudio;
    }

    public void setconfiguracaoDeAudio(String configuracaoDeAudio) {
        System.out.println("Configuranco o audio para" + configuracaoDeAudio );
        this.configuracaoDeAudio = configuracaoDeAudio;
    }

    public void on() {
        System.out.println("Liga o som do Jogo");
        //activate hardware...
    }

    public void off() {
        System.out.println("Desliga o som do Jogo");
        //deactivate hardware

    }
}
