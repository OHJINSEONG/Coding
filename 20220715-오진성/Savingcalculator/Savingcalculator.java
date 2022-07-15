import java.util.Scanner;

public class Savingcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //적금 이자 계산기 시작
        System.out.println("적금 이자 계산기");
        System.out.println("월적립액을 입력해주세요(원):");

        int money = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년)");

        int year = scanner.nextInt();

        System.out.println("연이자율을 입력해주세요(%)");

        double percent = scanner.nextDouble() / 1200;

        double percentaftermoney = money * (1 + percent) * (Math.pow((1 + percent), year * 12) - 1) / percent;
        int intputmoney = money * year * 12;
        double taxafterpercent = (percentaftermoney - intputmoney) * 0.846;
        double taxaftermoney = intputmoney + taxafterpercent;

        System.out.println("원금합계: " + intputmoney + "원");
        System.out.println("세후이자 " + String.format("%.0f", taxafterpercent) + "원");
        System.out.println("세후 총 수령액: " + String.format("%.0f", taxaftermoney) + "원");
    }
}
