import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("nhap chieu dai ");
        Scanner scanner = new Scanner(System.in);
        double cao = scanner.nextDouble();
        System.out.println("nhap chieu rong ");
        double rong = scanner.nextDouble();

        Rectangle re1 = new Rectangle(cao, rong);
        System.out.println("Your Rectangle \n" + re1.display());
        System.out.println("chu vi: "+ re1.chuvi());
        System.out.println("dien tich " + re1.dientich());
    }
}
