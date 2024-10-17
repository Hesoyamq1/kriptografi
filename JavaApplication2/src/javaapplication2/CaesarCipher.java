/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Fardi
 */
public class CaesarCipher {
    //Metode untuk mengenkripsi teks
     public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : text.toCharArray()) {
            // Menggeser huruf
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }
            encrypted.append(c);
        }
        return encrypted.toString();
    }

    // Metode untuk mendekripsi teks
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // Dekripsi dengan menggeser berlawanan
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan teks yang ingin dienkripsi: ");
        String text = scanner.nextLine();
        System.out.print("Masukkan jumlah pergeseran (shift): ");
        int shift = scanner.nextInt();

        // Melakukan enkripsi
        String encryptedText = encrypt(text, shift);
        System.out.println("Teks terenkripsi: " + encryptedText);

        // Melakukan dekripsi
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Teks terdekripsi: " + decryptedText);

        scanner.close();
    }
}
