package week4.optional;

public class Crypto {

    CaesarCipher cipher = new CaesarCipher(3);

    private String plainText;
    private String cipherText;

    public void encrypt(String plainText) {
        setCipherText(cipher.encrypt(plainText));
    }

    public void decrypt(String cipherText) {
        setPlainText(cipher.decrypt(cipherText));
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public static void main(String[] args) {
        Crypto crypto = new Crypto();
        String plainText = "GudBye World! kek";
        crypto.encrypt(plainText);
        crypto.decrypt(crypto.getCipherText());
        System.out.println("Plain Text: " + plainText);
        System.out.println("Encrypted Text: " + crypto.getCipherText());
        System.out.println("Decrypted Text: " + crypto.getPlainText());
    }
}
