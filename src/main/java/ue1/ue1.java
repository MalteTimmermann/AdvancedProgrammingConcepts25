package ue1;

import java.util.Scanner;

public class ue1 {

    public static void main(String[] args) {
        rateZahl();
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


}
