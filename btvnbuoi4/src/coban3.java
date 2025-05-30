import java.util.Scanner;

public class coban3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Nhập giá trị từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Đếm số phần tử chẵn
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }

        // Hiển thị kết quả
        System.out.println("Tổng số lượng phần tử chẵn trong mảng là: " + countEven);
    }
}
