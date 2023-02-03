package calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);


        System.out.println("첫 번째 수 : ");
        int fir = sc.nextInt();

        System.out.println("두 번째 수 : ");
        int sec = sc.nextInt();

        System.out.println("연산자 : ");
        String oper = sc.next();

//        System.out.print(fir + " " + oper + " " + sec " = " calculator.add(fir,sec));



    }
}
