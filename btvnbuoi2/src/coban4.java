public class coban4 {
    public static void main(String[] args) {
        // Khai báo các biến boolean
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Tạo điều kiện logic
        boolean condition1 = a && b;
        boolean condition2 = a || b;
        boolean condition3 = !c;

        // In kiểm tra điều kiện logic cơ bản
        if (a && b) {
            System.out.println("Cả hai đều đúng");
        } else {
            System.out.println("Hoặc a sai hoặc b sai");
        }

        if (a || b) {
            System.out.println("Ít nhất một đúng");
        }

        if (!a && b) {
            System.out.println("Không đúng: a là sai và b là đúng");
        }

        // Kiểm tra giá trị và phủ định của c
        System.out.println("Giá trị của c là: " + c);
        System.out.println("Phủ định của c là: " + !c);

        // In kết quả bằng toán tử 3 ngôi
        String result1 = condition1 ? "Cả hai giá trị a và b đều đúng" : "Hoặc a sai hoặc b sai";
        String result2 = condition2 ? "Trong a và b có ít nhất 1 giá trị đúng" : "Cả 2 giá trị a và b đều sai";
        String result3 = condition3 ? "Phủ định của c là đúng" : "Phủ định của c là sai";

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
