import java.util.Scanner;

public class Big3Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("할 일1: ");
        String answer1 = scanner.nextLine();

        System.out.print("할 일2: ");
        String answer2 = scanner.nextLine();

        System.out.print("할 일3: ");
        String answer3 = scanner.nextLine();

        System.out.println("오늘의 할일 Big3는 ");
        System.out.println("1. " + answer1);
        System.out.println("2. " + answer2);
        System.out.println("3. " + answer3);


    }
}
