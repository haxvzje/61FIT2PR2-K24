package week4.optional;

public class SubCrypto extends Crypto {

    SubstitutionCipher cipher = SubstitutionCipher.createSimpleCipher();

    @Override
    public void encrypt(String plainText) {
        setCipherText(cipher.encrypt(plainText));
    }

    @Override
    public void decrypt(String cipherText) {
        setPlainText(cipher.decrypt(cipherText));
    }

    public static void main(String[] args) {
        SubCrypto subCrypto = new SubCrypto();
        String plainText = "GudBye World! kek";
        subCrypto.encrypt(plainText);
        subCrypto.decrypt(subCrypto.getCipherText());
        System.out.println("Plain Text: " + plainText);
        System.out.println("Encrypted Text: " + subCrypto.getCipherText());
        System.out.println("Decrypted Text: " + subCrypto.getPlainText());
    }
}
