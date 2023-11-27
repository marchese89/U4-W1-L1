import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimetro rettangolo");
        System.out.println("dammi il primo lato");
        double x1 = Double.parseDouble(sc.nextLine());
        System.out.println("dammi il secondo numero");
        double x2 = Double.parseDouble(sc.nextLine());
        System.out.println("perimetro: " + perimetroRettangolo(x1, x2));
        System.out.println("Pari dispari");
        System.out.println("Dammi un numero intero");
        int n = Integer.parseInt(sc.nextLine());
        if (pariDispari(n) == 0) {
            System.out.println("numero pari");
        } else {
            System.out.println("numero dispari");
        }
        double a, b, c;
        System.out.println("Area del triangolo");
        System.out.println("dammi il primo lato");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("dammi il secondo lato");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("dammi il terzo lato");
        c = Double.parseDouble(sc.nextLine());
        System.out.println("Area: " + areaTriangolo(a, b, c));
    }

    public static double perimetroRettangolo(double x, double y) {
        return (x * 2) + (y * 2);
    }

    public static double areaTriangolo(double a, double b, double c) {
        double p = (a + b + c) / 2;//semiperimetro
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static int pariDispari(int n) {
        if (n % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
