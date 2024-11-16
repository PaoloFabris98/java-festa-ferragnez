package com.ferragnez.party;

import java.util.ArrayList;
import java.util.Scanner;
import guestClass.guestsClass;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<guestsClass> guestObjects = new ArrayList<>();
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone",
                "Rachel Zeilic" };
        Boolean[] invitation = { true, false, true, false, true, true, false, true, false, true, true };

        for (int i = 0; i < guests.length; i++) {
            guestObjects.add(new guestsClass(guests[i], invitation[i]));
        }

        System.out.println("\nDimmi il tuo nome per sapere se sei invitato alla festa.");
        String guestName = input.nextLine();

        int index = 0;
        boolean found = false;
        while (index < guestObjects.size()) {
            guestsClass currentGuest = guestObjects.get(index);
            if (currentGuest.name.equalsIgnoreCase(guestName)) {
                if (currentGuest.invitation) {
                    System.out.println("Sei invitato alla festa!");
                } else {
                    System.out.println("Non sei invitato alla festa.");
                }
                found = true;
                break;
            }
            index++;
        }

        if (!found) {
            System.out.println("Non sei sulla lista degli ospiti.");
        }

        input.close();
    }
}
