package edu.chl.trivialpursuit.model;

import java.util.ArrayList;

/**
 * Created by Rasti on 2015-05-05.
 */
public class ChoosePlayer {

    private int numberOfPlayers;
    private ArrayList<String> playerNames;


    public ChoosePlayer(){

        playerNames = new ArrayList<>();
        numberOfPlayers = 0;

    }

    public ArrayList<String> getPlayerNames() {
        return playerNames;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }


}
