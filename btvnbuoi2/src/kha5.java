import java.util.Scanner;

public class kha5 {
    public static void main(String[] args) {
        // Khai báo các biến
        float width, height, area, circumference;

        // Nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều rộng: ");
        width = scanner.nextFloat();

        System.out.print("Nhập chiều cao: ");
        height = scanner.nextFloat();

        // Tính toán diện tích và chu vi
        area = width * height;
        circumference = 2 * (width + height);

        // In kết quả ra màn hình (làm tròn 2 chữ số thập phân)
        System.out.printf("Diện tích: %.2f\n", area);
        System.out.printf("Chu vi: %.2f\n", circumference);
    }
}
