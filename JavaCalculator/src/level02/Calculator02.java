package level02;

public class Calculator02{
    private ResultQueue results = new ResultQueue();
    private char operator;
    private double x, y;

    public double getResult() {
        return x;
    }

    public void setter(double x, char operator, double y){
        this.x = x;
        this.y = y;
        this.operator = operator;
        calculator();
        System.out.println("결과 :"+getResult());
    }
    public void setter(char operator, double y){
        this.y = y;
        this.operator = operator;
        calculator();
        System.out.println("결과 :"+getResult());
        System.out.println("입력한 값보다 큰 결과값"+results.getGreaterThan(y));
    }
    private void calculator(){
        switch (operator){
            case '+' -> x = x + y;
            case '-' -> x = x - y;
            case '*' -> x = x * y;
            case '/' -> {
                if (y==0.0){System.out.println("0으로 나눌 수 없습니다.");}
                else {x = x / y;}
            }
            default -> System.out.println("지원하지 않는 연산자입니다.");
        }
        results.add(x);
        System.out.println("저장된 값 : "+results.getter());
    }
}
