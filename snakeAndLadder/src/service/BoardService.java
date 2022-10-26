package service;

import Model.Jumper;
import Model.Player;

import java.util.*;

public class BoardService {
    boolean winner;
    List<Jumper> snakes;
    List<Jumper> ladders;
    List<Player> players;

    DiceService diceService;
    Map<Player,Integer> playerPos;

    public BoardService(List<Jumper> snakes, List<Jumper> ladders, List<Player> players) {
        this.winner = false;
        this.snakes = snakes;
        this.ladders = ladders;
        this.players = players;
        this.playerPos = new HashMap<>();
        for (Player player : players) {
            playerPos.put(player, 0);
        }
        diceService=new DiceService();
    }
    public int cutSnake(int playerLoc,int start,int end)
    {
        if(start>end)
        {
            playerLoc=end;
            System.out.println("Snake Bit you! from "+start+" to "+end);
        }
        else
        {
            System.out.println("Wrong Snake arrangement");
        }
        return playerLoc;
    }
    public int TookLadder(int playerLoc,int start,int end)
    {
        if(start<end)
        {
            playerLoc=start;
            System.out.println("Ladder from "+start+" to "+end);
        }
        else
        {
            System.out.println("Wrong ladder arrangement");
        }
        return playerLoc;
    }
    public void startGame()
    {
        System.out.println("Game Starts!!!");

        Queue<Player> turn=new LinkedList<>();
        for(Player player:players)
        {
            System.out.println(player.getName()+" starting position is "+playerPos.get(player));
            turn.add(player);
        }
        while(this.winner!=true)
        {
            Player player=turn.remove();
            int diceNumber=diceService.rollDice();
            System.out.println(player.getName()+" threw and got "+diceNumber+" on dice.");
            int updatedPos=playerPos.get(player)+diceNumber;
            boolean encounteredJumper=false;

            for(Jumper jumper:ladders)
            {
                if(updatedPos==jumper.getStartLocation())
                {
                    updatedPos=this.TookLadder(updatedPos,jumper.getStartLocation(),jumper.getEndLocation());
                    System.out.println(player.getName()+" got ladder from  "+jumper.getStartLocation()+" to "+jumper.getEndLocation());
                    encounteredJumper=true;
                }
            }
            if(encounteredJumper==false) {
                for (Jumper jumper : snakes) {
                    if (updatedPos == jumper.getStartLocation()) {
                        updatedPos = this.cutSnake(updatedPos, jumper.getStartLocation(), jumper.getEndLocation());
                        System.out.println(player.getName()+" got bitten by snake from  "+jumper.getStartLocation()+" to "+jumper.getEndLocation());
                        encounteredJumper = true;
                    }
                }
            }
            playerPos.put(player,updatedPos);

            if(updatedPos==100)
            {
                System.out.println("\n\n\n\n\n"+player.getName()+" has won the game \n\n\n\n\n");
                winner=true;
            }
            turn.add(player);
        }
        System.out.println("Game over!!!");
    }
}
