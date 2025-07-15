package level02;

public enum OperatorType {
    // 공부 영상 보는 중
    SUM("+"),
    MIN("-"),
    DIV("/"),
    MUL("*");


    private final String symbol;         // 각 상수가 가지는 문자열 값을 저장할 필드 선언

    OperatorType(String symbol) {           // enum 생성자: 각 상수가 호출 시 문자열을 받아 필드에 저장
        this.symbol = symbol;            // 전달받은 문자열을 필드에 할당
    }

    public String getSymbol() {          // symbol 값을 반환하는 getter 메서드 선언
        return symbol;                   // symbol 필드 반환
    }
}
