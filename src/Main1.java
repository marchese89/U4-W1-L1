public class Main1 {
    public static void main(String[] args) {
        System.out.println("Moltiplica 3 4: " + moltiplica(3, 4));
        System.out.println("concatena: " + concatena("Ciao ", 1));
        System.out.println("inserisci in array: ");
        String[] arrStr = {"Stringa1", "Stringa2", "Stringa3", "Stringa4", "Stringa5"};
        String[] res = inserirsciInArray(arrStr, "Innesto");
        for (String s : res) {
            System.out.print(s + " ");
        }
    }

    public static int moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String concatena(String s, int n) {
        return s + n;
    }

    public static String[] inserirsciInArray(String[] array, String s) {
        if (array.length != 5) {
            return null;
        }
        String[] newArray = new String[6];
        for (int i = 0; i < 2; i++) {
            newArray[i] = array[i];
        }
        newArray[2] = s;
        for (int i = 3; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }

}