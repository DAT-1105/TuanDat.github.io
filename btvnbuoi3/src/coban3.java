import java.util.Scanner;

public class coban3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi văn bản: ");
        String inputText = scanner.nextLine();

        System.out.print("Nhập từ cần tìm: ");
        String wordToFind = scanner.nextLine();

        int position = inputText.indexOf(wordToFind);

        if (position != -1) {
            System.out.println("Từ \"" + wordToFind + "\" xuất hiện tại vị trí " + position + " trong chuỗi.");
        } else {
            System.out.println("Không tìm thấy từ \"" + wordToFind + "\" trong chuỗi.");
        }

        scanner.close();
    }
}
