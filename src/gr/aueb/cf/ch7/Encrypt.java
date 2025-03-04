package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Εισάγετε το κείμενο για κρυπτογράφηση: ");
        String inputText = scanner.nextLine();

        String encryptedText = encrypt(inputText);
        System.out.println("Κρυπτογραφημένο κείμενο: " + encryptedText);

        scanner.close();
    }

    /**
     * Μέθοδος κρυπτογράφησης (μετατόπιση κάθε χαρακτήρα στον επόμενο ASCII)
     * @param text
     * @return
     */
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encryptedText.append((char) (c + 1));
        }
        return encryptedText.toString();
    }
}
