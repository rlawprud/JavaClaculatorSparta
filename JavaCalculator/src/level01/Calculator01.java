package level01;
import java.util.*;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1;
        int num2;
        String input;
        String operator;

        System.out.println("숫자를 입력해주세요. :");
        input = in.nextLine();
        if (input.equals("exit")) return;
        try {
            num1 = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("정수를 입력해주세요. :");
            return;
        }

        while (true) {
            System.out.println("연산자를 입력해주세요. : ");
            operator = in.nextLine();
            if (operator.equals("exit")) break;

            System.out.println("숫자를 입력해주세요. : ");
            input = in.nextLine();
            if (input.equals("exit")) break;

            try {
                num2 = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력해주세요. : ");
                continue;
            }

            switch (operator) {
                case "+":
                    num1 += num2;
                    break;
                case "-":
                    num1 -= num2;
                    break;
                case "*":
                    num1 *= num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    } else {
                        num1 /= num2;
                    }
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");
                    continue;
            }

            System.out.println("결과: " + num1);
        }

        System.out.println("계산기를 종료합니다.");
    }
}