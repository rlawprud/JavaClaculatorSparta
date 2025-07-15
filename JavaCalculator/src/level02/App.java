package level02;
import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Calculator02 calculator = new Calculator02();
        Scanner sc = new Scanner(System.in);

        double x, y;
        String input;
        char operator;
        System.out.print("첫 번째 숫자를 입력해주세요. : ");
        input = sc.nextLine();
        if (input.equals("exit")) {return;}
        else {x = Double.parseDouble(input);}
        System.out.println("연산자를 입력해주세요.");
        input = sc.nextLine();
        if (input.equals("exit")) {return;}
        else {operator = input.charAt(0);}
        System.out.println("두 번째 숫자를 입력해주세요.");
        input = sc.nextLine();
        if (input.equals("exit")) {return;}
        else {y = Double.parseDouble(input);}
        calculator.setter(x,operator,y);

        while (true) {
            System.out.println("연산자를 입력해주세요.");
            input = sc.nextLine();
            if (input.equals("exit")) {break;}
            else {operator = input.charAt(0);}

            System.out.println("두 번째 숫자를 입력해주세요.");
            input = sc.nextLine();
            if (input.equals("exit")) {break;}
            else {y = Double.parseDouble(input);}

            calculator.setter(operator,y);
        }
        System.out.println("프로그램 종료");
    }
}
