package com.ferragnez.party;
import java.util.Scanner;


public class CheckGuestOop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] list = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        GuestList guest = new GuestList(list);

        System.out.println("- Welcome to the Ferragnez Party -");
        System.out.println("------------------------------------");
        guest.printList();
        System.out.println("Prego, inserisci il tuo nome : ");
        System.out.println("");
        guest.guestName = scan.nextLine();
        System.out.println("");
        guest.checkName(guest.guestName);

    }
    
    
}
