package patterns.command;

import patterns.command.commands.*;
import patterns.command.hardware.*;

public class Main {

    public static void main(String[] args) {
        //Example 1 - slots vazios
//        DispositivoGoogleHome GoogleHome = new DispositivoGoogleHome();
//        System.out.println(GoogleHome);

//      ---------------------------------------------------------------

        //Example 2 - Luzes da Sala Ligada
        // DispositivoGoogleHome GoogleHome = new DispositivoGoogleHome();

        // //Create an instance
        // LuzesDaSala luzesDaSala = new LuzesDaSala();

        // //Set the slots with new commands
        // GoogleHome.setCommand(
        //           0,
        //         new LuzesDaSalaLigada(luzesDaSala),
        //         new LuzesDaSalaDesliga(luzesDaSala)
        // );

        // System.out.println(GoogleHome);

        // GoogleHome.activateSlot(0);
        // GoogleHome.deactivateSlot(0);

//      ---------------------------------------------------------------

        //Example 3 - Hora do Jogo!
        DispositivoGoogleHome GoogleHome = new DispositivoGoogleHome();

        //Create an instance
        LuzesDaSala luzesDaSala = new LuzesDaSala();
        Music music = new Music();
        Persianas persianas = new Persianas();

        //Set the slots with new commands
        GoogleHome.setCommand(
                1,
                new ComandoTudoLigado(music, luzesDaSala, persianas),
                new ComandoTudoDesligado(music, luzesDaSala, persianas)
        );

        System.out.println(GoogleHome);

        GoogleHome.activateSlot(1);
        GoogleHome.deactivateSlot(1);

    }
}
