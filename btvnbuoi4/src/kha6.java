public class kha6 {
    public static void main(String[] args) {
        // Khởi tạo originalArray với 20 phần tử từ 1 đến 1000
        int[] originalArray = {
                8, 12, 100, 8, 999, 8, 33, 12, 33, 100,
                8, 33, 100, 999, 8, 12, 100, 8, 8, 44
        };

        // Khởi tạo markingArray để đếm số lần xuất hiện (index là giá trị phần tử - 1)
        int[] markingArray = new int[1000];  // Chỉ số 0 -> 999 tương ứng giá trị 1 -> 1000

        // Đếm số lần xuất hiện
        for (int num : originalArray) {
            markingArray[num - 1]++;
        }

        // Tìm phần tử xuất hiện nhiều nhất
        int maxCount = 0;
        int maxValue = -1;

        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] > maxCount) {
                maxCount = markingArray[i];
                maxValue = i + 1; // vì giá trị = index + 1
            }
        }

        // Xuất kết quả
        System.out.println("Phần tử xuất hiện nhiều nhất: " + maxValue);
        System.out.println("Số lần xuất hiện: " + maxCount);
    }
}
