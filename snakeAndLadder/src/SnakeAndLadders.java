import Model.Jumper;
import Model.Player;
import service.*;

import java.util.ArrayList;
import java.util.List;

public class SnakeAndLadders {

    public static void main(String [] args) {
        JumperService jumperService = new JumperServiceImpl();
        PlayerService playerService = new PlayerServiceImpl();
        Player sangya = playerService.addPlayer("Sangya", "sangya@gmail.com", "sangya");
        Player ishi = playerService.addPlayer("Ishi", "Ishi@gmail.com", "ishi");
        Player abhi = playerService.addPlayer("Abhi", "Abhi@gmail.com", "abhi");
        Player arpu = playerService.addPlayer("Arpu", "Arpu@gmail.com", "arpu");

        List<Player> players = new ArrayList();
        players.add(sangya);
        players.add(ishi);
        players.add(abhi);
        players.add(arpu);

        Jumper s1 = jumperService.addJumper(94, 16);
        Jumper s2 = jumperService.addJumper(76, 35);
        Jumper s3 = jumperService.addJumper(51, 20);
        Jumper s4 = jumperService.addJumper(33, 5);

        Jumper l1 = jumperService.addJumper(9, 25);
        Jumper l2 = jumperService.addJumper(33, 62);
        Jumper l3 = jumperService.addJumper(40, 69);

        List<Jumper> snakes = new ArrayList<>();
        snakes.add(s1);
        snakes.add(s2);
        snakes.add(s3);
        snakes.add(s4);

        List<Jumper> ladder = new ArrayList<>();
        ladder.add(l1);
        ladder.add(l2);
        ladder.add(l3);

        BoardService boardService = new BoardService(snakes, ladder, players);
        boardService.startGame();
    }

}
