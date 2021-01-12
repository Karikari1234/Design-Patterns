package com.company.factory;

public class PlayerFactory {

    public Player getPlayer(String playerType){
        if(playerType.equals("Batsman")){
            return new Batsman();
        }
        else if(playerType.equals("Bowler")) {
            return new Bowler();
        }

        return null;
    }
}
