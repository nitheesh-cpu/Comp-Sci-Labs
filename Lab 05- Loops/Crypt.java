public class Crypt {
    private String encString;
    private String decString;

    public Crypt(String enc, String dec) {
        encString = enc;
        decString = dec;
    }

    public String encode(String message) {
        int i = 0;
        while (i < message.length()) {
            String letter = message.substring(i, i + 1);
            if (encString.indexOf(letter) >= 0) {
                message = message.substring(0, i) + decString.substring(encString.indexOf(letter), encString.indexOf(letter) + 1) + message.substring(i + 1);
            }
            i++;
        }
        return message;
    }

    public String decode(String message) {
        int i = 0;
        while (i < message.length()) {
            String letter = message.substring(i, i + 1);
            if (decString.indexOf(letter) >= 0) {
                message = message.substring(0, i) + encString.substring(decString.indexOf(letter), decString.indexOf(letter) + 1) + message.substring(i + 1);
            }
            i++;
        }
        return message;
    }
}
