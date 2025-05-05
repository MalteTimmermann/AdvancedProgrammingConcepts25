package homework4.exercise2;

import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String a = scanner.nextLine();
        System.out.println("Enter second string: ");
        String b = scanner.nextLine();

        if(isAnagram(a, b)){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        System.out.println("Letter counts for the first string:");
        printLetterCounts(a);

        System.out.println("Letter counts for the second string:");
        printLetterCounts(b);
    }

    public static boolean isAnagram(String a, String b){
        int[] countsA = countLetters(a);
        int[] countsB = countLetters(b);
        for(int i = 0; i < countsA.length; i++){
            if(countsA[i] != countsB[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] countLetters(String s){
        int[] counts = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                counts[Character.toLowerCase(c) - 'a']++;
            }
        }
        return counts;
    }

    public static void printLetterCounts(String s){
        int[] counts = countLetters(s);
        for(int i = 0; i < counts.length; i++){
            if(counts[i] > 0){
                System.out.println((char)(i + 'a') + ": " + counts[i]);
            }
        }
    }
}

/* Zusätzliche Fragen:
    1. == vergleicht die Speicheradressen der zwei Objekte und equals() vergleicht den Inhalt der Objekte.
    2. Es wird true zurückgegeben, da der String "abc" im Strint-Constant-Pool gespeichert wird und die Referenz auf das selbe Objekt zeigt.
    3. Wenn man mit new String("abc") arbeitet, wird ein neues Objekt im Heap erstellt und die Referenz zeigt auf dieses neue Objekt. Es wird also false zurückgegeben
 */

