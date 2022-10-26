package service;

import Model.Player;

public interface PlayerService {
    Player addPlayer(String name, String emailId, String playerId);
}
