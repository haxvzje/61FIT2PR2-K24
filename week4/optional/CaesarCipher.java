package week4.optional;

public class CaesarCipher {
    private int shift;

    // Constructor to set the shift value
    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    // Encrypt method
    public String encrypt(String plainText) {
        StringBuilder result = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            // Only shift letters, leave other characters unchanged
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Decrypt method
    public String decrypt(String cipherText) {
        StringBuilder result = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Main method for demonstration
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(3); // Shift by 3

        String plainText = "HELLO WORLD";
        String encrypted = cipher.encrypt(plainText);
        String decrypted = cipher.decrypt(encrypted);

        System.out.println("Plain Text : " + plainText);
        System.out.println("Encrypted  : " + encrypted);
        System.out.println("Decrypted  : " + decrypted);
    }
}
