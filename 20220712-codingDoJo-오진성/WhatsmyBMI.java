import java.util.Scanner;

public class WhatsmyBMI {
    public static void main(String[] args) {
        System.out.println("BMI 측정기");
        Scanner scanner = new Scanner(System.in);
        System.out.print("신장(m): ");
        double answer1 = scanner.nextDouble();

        System.out.print("체중(kg): ");

        double answer2 = scanner.nextDouble();

        double x = answer2 / Math.pow(answer1, 2);


        if ((x < 18.5) || (x == 18.5)) {
            System.out.println("비만도 결과: 저체중");
            System.out.println("BMI: " + x);
            return;

        }
        if ((x < 23) || (x == 23)) {
            System.out.println("비만도 결과: 정상");
            System.out.println("BMI: " + x);
            return;
        }
        if ((x < 25) || (x == 25)) {
            System.out.println("비만도 결과: 과체중");
            System.out.println("BMI: " + x);
            return;
        }
        if (x > 25) {
            System.out.println("비만도 결과: 비만");
            System.out.println("BMI: " + x);
            return;
        }
    }
}
