public class coban1 {
    public static void main(String[] args) {
        // Khai báo mảng (bạn có thể thay đổi để test các test case khác)
        int[] arr = {12, 1, 18, 9};

        // Giả sử phần tử đầu tiên là lớn nhất
        int max = arr[0];

        // Duyệt mảng để tìm giá trị lớn nhất
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Cập nhật max
            }
        }

        // In kết quả
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
