package com.ferragnez.party;

public class GuestList {
    String [] guest;
    String guestName;
    boolean isOnList;


    public GuestList (String [] guest) {
       this.guest = guest;
    }

    public void printList () {
        System.out.println("' Guest List '");
        System.out.println("-----------------");
        System.out.println("");
        for (int i = 0; i < guest.length; i++) {
            System.err.println(guest[i]);
       };
       System.out.println("");
       System.out.println("------------");
        System.out.println("");
    }

    public void checkName (String guestName) {
        this.guestName = guestName;
        isOnList = false;
        for (String current : guest) {
            if (current.equals(guestName)) {
                isOnList = true;
                break;
            }
        }
        if (isOnList) {
            System.out.println("Benvenuto gentile ospite, si accomodi!");
        } else {
            System.out.println("Mi dispiace, non hai abbasanza followers per partecipare alla festa!");
        };

        System.out.println("");
        System.out.println("");
    }
}
