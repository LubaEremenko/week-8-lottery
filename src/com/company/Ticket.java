package com.company;

public class Ticket {
    private String ticketName;
    private int[] playerNumber = new int[6];

    public Ticket(String Name, int[] ticketNumbers) {
        ticketName = Name;
        playerNumber = ticketNumbers;


    }

    public String getTicketName() {

        return ticketName;
    }

    public int[] getPlayerNumber() {
        return playerNumber;

    }

    public int getWin(int match){
        int winAmountOfMoney;
        switch (match){
            case 3: winAmountOfMoney = 10;
            break;
            case 4: winAmountOfMoney = 100;
            break;
            case 5: winAmountOfMoney = 1000;
            break;
            case 6: winAmountOfMoney = 10000;
            break;
        }
        return winAmountOfMoney;
    }
}
