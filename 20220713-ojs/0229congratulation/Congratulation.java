import java.util.Scanner;

public class Congratulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //연도
        System.out.print("연도: ");

        //대답
        int answer = scanner.nextInt();

        //출력
        if (((answer % 4) == 0 && (answer % 100) != 0) || ((answer % 400) == 0)) {
            System.out.println("ture");
        return;
        }
        System.out.println("false");
    }
}
