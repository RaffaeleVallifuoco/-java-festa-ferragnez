package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("-Ferragnez party list-");
        String[] partyList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println("invitati :");
        for (int i = 0; i < partyList.length; i++) {
            System.err.println(partyList[i]);
       };
        System.err.println("------------------------");
        System.out.println("Inserisci il tuo nome ");
        String guestName = scan.nextLine();
        boolean isOnList = false;
        for (String current : partyList) {
            if (current.equals(guestName)) {
                isOnList = true;
                break;
            }
        }
        if (isOnList) {
            System.out.println("Benvenuto gentile ospite, si accomodi!");
        } else {
            System.out.println("Mi dispiace, caro il mio pezzente. Torna a fare la fila alla Caritas !");
        };
        System.out.println("--------------------------------------------");
    }

}
