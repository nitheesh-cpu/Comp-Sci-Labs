import java.util.*;
import java.io.*;
public class ReverseCipher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to encrypt");
        String encrypt = input.nextLine();
        System.out.println("Enter an integer for encryption string");
        int encryptKey = input.nextInt();
        System.out.println(encrypt(encrypt,encryptKey));
        System.out.println("Enter a sentence to decrypt");
        String decrypt = input.nextLine();
        decrypt = input.nextLine();
        System.out.println("Enter an integer for decryption string");
        int decryptKey = input.nextInt();
        System.out.println(decrypt(decrypt,decryptKey));

    }
    public static String encrypt(String encrypt, int key){
        char replace;
        for(int i = encrypt.length()-1; i >= 0; i--){
            replace = (char)(encrypt.charAt(i) + key);
            encrypt = encrypt.substring(0,i) + encrypt.substring(i+1) + replace ;
        }
        return encrypt;
    }
    public static String decrypt(String decrypt, int key){
        char replace;
        for(int i = decrypt.length()-1; i >= 0; i--){
            replace = (char)(decrypt.charAt(i) - key);
            decrypt = decrypt.substring(0,i) + decrypt.substring(i+1) + replace ;
        }
        return decrypt;
    }
}
