import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("dammi la stringa numero " + (i + 1));
            strings[i] = sc.nextLine();
        }
        System.out.println("Stringhe in ordine di inserimento");
        System.out.println(concat(strings, true));
        System.out.println("Stringhe in ordine inverso");
        System.out.println(concat(strings, false));
        sc.close();
    }

    public static String concat(String[] array, boolean order) {
        StringBuilder sb = new StringBuilder();
        if (order) {
            for (String s : array) {
                sb.append(s);
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }
}
