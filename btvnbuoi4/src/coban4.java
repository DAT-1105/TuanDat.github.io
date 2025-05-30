import java.util.Scanner;
import java.util.Arrays;

public class coban4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Kích thước rỗng");
            return;
        }

        int[] arr = new int[n];

        // Nhập giá trị phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        // Đảo ngược mảng
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Hiển thị mảng sau khi đảo
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));
    }
}
