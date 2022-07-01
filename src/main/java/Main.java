import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ausgabe();
    }

    public static void ausgabe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib ein Passwort ein:");
        String inputStr = sc.nextLine();

        if (hasLowerCase(inputStr)) {
            System.out.println("Dein Passwort enthält Kleinbuchstaben, versuchs noch einmal!");
            ausgabe();
        } else {
            System.out.println("Das Passwort enthält keine KLeinbuchstaben und wird weiter überprüft!");
        }
        if (hasLength3To10(inputStr)) {
            System.out.println("Die Länge passt!");
        } else {
            System.out.println("Die Länge passt nicht!");
        }
        if (hasNumber(inputStr)) {
            System.out.println("Das Passwort enthält mehr als eine Nummer");
        } else {
            System.out.println("Das Passwort enthält keine Nummer");
        }

        boolean perfect = isPerfect(inputStr);
        System.out.println("Das Passwort ist genial!?" + perfect);
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

    public static boolean isPerfect(String str) {
        String regEx = "\\D{3,5}\\d{1,3}";
        return str.matches(regEx);
    }jalsdjfö

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

    public static boolean isBad(String str) {
        return str.equalsIgnoreCase("PASSWORT") || str.contains("123") || str.contains("234");
    }
}
