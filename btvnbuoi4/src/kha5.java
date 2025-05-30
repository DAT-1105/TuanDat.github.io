import java.util.Scanner;

public class kha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhập giá trị phần tử mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Khởi tạo biến max/min cho phần tử lẻ nguyên dương
        Integer maxOdd = null;
        Integer minOdd = null;

        // Duyệt mảng
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                if (maxOdd == null || arr[i] > maxOdd) {
                    maxOdd = arr[i];
                }
                if (minOdd == null || arr[i] < minOdd) {
                    minOdd = arr[i];
                }
            }
        }

        // Xuất kết quả
        if (maxOdd == null) {
            System.out.println("Không có phần tử lẻ trong mảng");
        } else {
            System.out.println("Phần tử lẻ nguyên dương lớn nhất: " + maxOdd);
            System.out.println("Phần tử lẻ nguyên dương nhỏ nhất: " + minOdd);
        }
    }
}
