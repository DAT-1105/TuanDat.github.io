import java.util.Scanner;

public class coban3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị cho x và y
        System.out.print("Nhập x = ");
        int x = scanner.nextInt();

        System.out.print("Nhập y = ");
        int y = scanner.nextInt();

        // In kết quả so sánh
        System.out.println("x = y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));
    }
}
