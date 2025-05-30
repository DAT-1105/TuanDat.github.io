import java.util.Scanner;

public class coban2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo và khởi tạo mảng
        int[] arr = new int[n];

        // Nhập giá trị cho từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tính tổng các phần tử
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // In kết quả
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
