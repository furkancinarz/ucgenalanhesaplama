import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int a, b, c;
        double u;
        double alan;

        Scanner girdi =new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        b= girdi.nextInt();

        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextInt();

        u = (double) (a + b + c) / 2;
        System.out.println("Üçgen çevresi : " + u);

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin alanı : " + alan);

    }
}