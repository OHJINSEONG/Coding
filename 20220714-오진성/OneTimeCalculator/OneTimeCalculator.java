import java.util.Scanner;

public class OneTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //계산기 시작
        System.out.println("급할 때 사용하는 일회용 계산기");
        System.out.println("숫자를 입력해 주세요: ");

        //계산할 숫자 입력
        double num1 = scanner.nextDouble();

        System.out.println("연산자를 선택해주세요:");
        System.out.println("1. + (더하기)\n2. - (빼기)\n3. * (곱하기)\n4. / (나누기)");

        //연산자 선택
        int answer = scanner.nextInt();

        System.out.println("숫자를 입력해 주세요:");

        //계산할 숫자 입력2
        double num2 = scanner.nextDouble();

        //계산 결과
        if (answer == 1) {
            System.out.println("계산 결과: " + (num1 + num2));
        }
        if (answer == 2) {
            System.out.println("계산 결과: " + (num1 - num2));
        }
        if (answer == 3) {
            System.out.println("계산 결과: " + (num1 * num2));
        }
        if (answer == 4) {
            System.out.println("계산 결과: " + (num1 / num2));
        }
    }
}
