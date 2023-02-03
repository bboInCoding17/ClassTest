package study;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();

        //반지름을 변경하는 방법
       // c.r  =10;// 해당 매개변수에 직접 변수 입력 - 웬만하면 쓰지 말기!
        //private을 Class에 넣어주면, 변수 r이 인식되지 않도록 하면, 데어터 값 오류를 줄일 수 있다
        c.setR(10);//메소드는 이상한 정보가 들어오면 데이터에서 제어 가능


        System.out.println(c.getSize());
    }
}
