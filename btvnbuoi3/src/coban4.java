import java.util.Scanner;

public class coban4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        while (true) {
            System.out.print("Nhập số (nhập 0 để kết thúc): ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Tổng các số đã nhập là: " + sum);
        scanner.close();
    }
}
