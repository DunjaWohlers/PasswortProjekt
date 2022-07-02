import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message = "Keine Nachricht vorhanden";
        String input = "";
        while (message != "") {
            input = scan();
            message = passwortPruefen(input);
            System.out.println(message);
        }

        if (message == "") {//keine Error-Nachricht vorhanden:
            message = positiveFeedback(input);
        } else {
        }
        System.out.println(message);
    }

    public static String scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib ein Passwort ein:");
        return sc.nextLine();
    }


    public static String passwortPruefen(String inputStr) {
        String message = "";
        if (!hasLowerCase(inputStr) || !hasUpperCase(inputStr) || !hasLength3To10(inputStr) || !hasNumber(inputStr)) {
            message = errorNachricht(inputStr);
        } else {
        }
        return message;
    }

    public static String positiveFeedback(String inputStr) {
        if (isPerfect(inputStr)) {
            return "Ich mag dein Passwort, es ist perfekt!\n";
        } else {
            return "Das Passwort genügt den Anforderungen!\n";
        }
    }

    public static String errorNachricht(String inputStr) {
        String error = "";
        if (!hasLowerCase(inputStr)) {
            error += "Dein Passwort enthält keine Kleinbuchstaben, versuchs noch einmal!\n";
        } else {
        }
        if (!hasUpperCase(inputStr)) {
            error += "Dein Passwort enthält keine Großbuchstaben, versuchs noch einmal!\n";
        }
        if (!hasLength3To10(inputStr)) {
            error += "Die Länge muss zwischen 3 und 10 Zeichen betragen!\n";
        } else {
        }
        if (!hasNumber(inputStr)) {
            error += "Dein Passwort muss mindestens eine Nummer enthalten!\n";
        }
        return error;
    }

    public static boolean hasLength3To10(String str) {
        return str.length() <= 10 && str.length() >= 3;
    }

    public static boolean hasNumber(String str) {
        boolean hasNum = false;
        for (int i = 0; i < str.length(); i++) {
            char x = pickLetterAt(str, i);
            if (Character.isDigit(x)) {
                hasNum = true;
            }
        }
        return hasNum;
    }

    public static char pickLetterAt(String str, int zaehler) {
        return str.charAt(zaehler);
    }


    public static boolean hasLowerCase(String str) {
        boolean hasLowerCase = false;
        for (int i = 0; i < str.length(); i++) {
            char x = pickLetterAt(str, i);
            if (Character.isLowerCase(x)) {
                hasLowerCase = true;
            }
            ;
        }
        return hasLowerCase;
    }

    public static boolean hasUpperCase(String str) {
        boolean hasUpperCase = false;
        for (int i = 0; i < str.length(); i++) {
            char x = pickLetterAt(str, i);
            if (Character.isUpperCase(x)) {
                hasUpperCase = true;
            }
            ;
        }
        return hasUpperCase;
    }

    public static boolean isBad(String str) {
        return str.equalsIgnoreCase("PASSWORT") || str.contains("123") || str.contains("234");
    }


    public static boolean isPerfect(String str) {
        String regEx = "[A-Za-z]{3,5}\\d{1,3}";
        return str.matches(regEx);
    }
}
