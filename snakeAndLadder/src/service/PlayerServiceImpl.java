package service;

import Model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerServiceImpl implements PlayerService{
    Player player;
    List<Player> players;
    @Override
    public Player addPlayer(String name, String emailId, String playerId) {
        player =new Player();
        players=new ArrayList<>();
        player.setPlayerId(playerId);
        player.setName(name);
        player.setEmailId(emailId);
        players.add(player);
        return player;
    }
}
