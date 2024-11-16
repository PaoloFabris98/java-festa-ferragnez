package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.println("Dimmi il tuo nome per sapere se sei invitato alla festa.");
        String guest = input.nextLine();
        int itteration = 0;
        Boolean finded = false;

        while (itteration < guests.length || finded == false) {
            if (guests[itteration].equals(guest)) {
                System.out.println("Sei invitato alla festa.");
                break;
            } else {
                System.out.println("Non sei invitato alla festa.");
            }
            itteration++;
        }
        input.close();
    }
}
