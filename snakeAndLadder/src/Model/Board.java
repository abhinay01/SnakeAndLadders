package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    List<Jumper> snakes;
    List<Jumper> ladders;
    List<Player> players;

    Map<Player,Integer> playerPos;

    public Board() {
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
        this.players = new ArrayList<>();
        this.playerPos = new HashMap<>();
    }

    public List<Jumper> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Jumper> snakes) {
        this.snakes = snakes;
    }

    public List<Jumper> getLadders() {
        return ladders;
    }

    public void setLadders(List<Jumper> ladders) {
        this.ladders = ladders;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Map<Player, Integer> getPlayerPos() {
        return playerPos;
    }

    public void setPlayerPos(Map<Player, Integer> playerPos) {
        this.playerPos = playerPos;
    }
}
