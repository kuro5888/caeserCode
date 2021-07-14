import java.util.Locale;

public class CaeserCipher {

    public String encode(int steps, String string) {
        char[] stringSplit = string.toCharArray();
        for (int i = 0; i < stringSplit.length; i++) {
            char ch = stringSplit[i];
            //Space continue
//            if (ch == 32) {
//                continue;
//            }
            if (ch >= 97 && ch <= 122) { //lowercase
                ch += steps;
                if (ch > 122) {
                    ch -= 26;
                }
            } else if (ch >= 65 && ch <= 90) { //uppercase
                ch += steps;
                if (ch > 90) {
                    ch -= 26;
                }
            }
            stringSplit[i] = ch;
        }
        return String.valueOf(stringSplit);
    }

        public String decode ( int steps, String string){
            char[] stringSplit = string.toCharArray();
            for (int i = 0; i < stringSplit.length; i++) {
                char ch = stringSplit[i];
                //Space continue
//            if (ch == 32) {
//                continue;
//            }
                if (ch >= 97 && ch <= 122) { //lowercase
                    ch -= steps;
                    if (ch < 97){
                        ch += 26;
                    }
                } else if (ch >= 65 && ch <= 90) { //uppercase
                    ch -= steps;
                    if (ch < 65){
                        ch += 26;
                    }
                }
                stringSplit[i] = ch;
            }
            return String.valueOf(stringSplit);
        }

    }
