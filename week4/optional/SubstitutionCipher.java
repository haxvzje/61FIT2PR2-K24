package week4.optional;

import java.util.HashMap;
import java.util.Map;

public class SubstitutionCipher {
    private Map<Character, Character> encryptMap;
    private Map<Character, Character> decryptMap;

    // Constructor: takes two strings of equal length (alphabet and substitution)
    public SubstitutionCipher(String alphabet, String substitution) {
        encryptMap = new HashMap<>();
        decryptMap = new HashMap<>();

        for (int i = 0; i < alphabet.length(); i++) {
            char plainChar = alphabet.charAt(i);
            char cipherChar = substitution.charAt(i);
            encryptMap.put(plainChar, cipherChar);
            decryptMap.put(cipherChar, plainChar);
        }
    }

    // Encrypt helper
    public String encrypt(String plainText) {
        StringBuilder result = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (encryptMap.containsKey(c)) {
                result.append(encryptMap.get(c));
            } else {
                result.append(c); // keep characters not in map unchanged
            }
        }
        return result.toString();
    }

    // Decrypt helper
    public String decrypt(String cipherText) {
        StringBuilder result = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            if (decryptMap.containsKey(c)) {
                result.append(decryptMap.get(c));
            } else {
                result.append(c); // keep characters not in map unchanged
            }
        }
        return result.toString();
    }

    // Helper to build a simple substitution (e.g., reversed alphabet)
    public static SubstitutionCipher createSimpleCipher() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String substitution = new StringBuilder(alphabet).reverse().toString();
        return new SubstitutionCipher(alphabet, substitution);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        SubstitutionCipher cipher = SubstitutionCipher.createSimpleCipher();

        String plainText = "hello world";
        String encrypted = cipher.encrypt(plainText);
        String decrypted = cipher.decrypt(encrypted);

        System.out.println("Plain Text: " + plainText);
        System.out.println("Encrypted : " + encrypted);
        System.out.println("Decrypted : " + decrypted);
    }
}