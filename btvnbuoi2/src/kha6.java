import java.util.Scanner;

public class kha6 {
    public static void main(String[] args) {
        // Khai báo biến
        String name;
        float diem1, diem2, diem3, diemTB;
        String danhGia;

        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.println("----------Nhập thông tin sinh viên----------");
        System.out.print("Nhập tên sinh viên: ");
        name = scanner.nextLine();

        System.out.print("Nhập điểm môn học 1: ");
        diem1 = scanner.nextFloat();

        System.out.print("Nhập điểm môn học 2: ");
        diem2 = scanner.nextFloat();

        System.out.print("Nhập điểm môn học 3: ");
        diem3 = scanner.nextFloat();

        // Tính điểm trung bình
        diemTB = (diem1 + diem2 + diem3) / 3;

        // Đánh giá xếp loại (toán tử 3 ngôi)
        danhGia = (diemTB >= 5.0) ? "Lên lớp" : "Học lại";

        // In kết quả
        System.out.println("----------Hiển thị thông tin sinh viên----------");
        System.out.printf("Tên sinh viên: %s\n", name);
        System.out.printf("Điểm môn 1: %.2f | Điểm môn 2: %.2f | Điểm môn 3: %.2f\n", diem1, diem2, diem3);
        System.out.printf("Điểm trung bình: %.2f\n", diemTB);
        System.out.println("Đánh giá: " + danhGia);
    }
}
