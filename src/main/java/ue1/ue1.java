package ue1;

import java.util.Scanner;

public class ue1 {

    public static void main(String[] args) {
        //rateZahl();
        snakeLanguageTranslator();
    }

    public static void rateZahl(){
        int zufallsZahl = (int) (Math.random() * 20) + 1;
        int versuche = 0;
        boolean gefunden = false;

        while(gefunden == false && versuche < 5){
            System.out.println("Bitte geben Sie eine Zahl ein:");
            Scanner scanner = new Scanner(System.in);
            int eingabe = scanner.nextInt();

            if(eingabe == zufallsZahl){
                gefunden = true;
                System.out.println("Herzlichen Glückwunsch! Sie haben die Zahl " + zufallsZahl + " in " + versuche + " Versuchen erraten.");
            } else if(eingabe < zufallsZahl){
                System.out.println("Die gesuchte Zahl ist größer.");
            } else {
                System.out.println("Die gesuchte Zahl ist kleiner.");
            }
            versuche++;
        }

        if(!gefunden){
            System.out.println("Leider haben Sie die Zahl nicht erraten. Die gesuchte Zahl war " + zufallsZahl + ".");
        }
    }

    public static void snakeLanguageTranslator(){
        String vowels = "aeiouAEIOU";

        System.out.println("Bitte geben Sie einen Text ein:");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        String ausgabe = "";

        for (int i = 0; i < eingabe.length(); i++) {
            char position = eingabe.charAt(i);
            if (vowels.contains(String.valueOf(position))) {
                ausgabe += position + "s" + position;
            } else {
                ausgabe += position;
            }
        }
        System.out.println(ausgabe);
    }
}
