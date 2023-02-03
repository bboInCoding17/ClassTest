package study;

public class CallByReference {
    public static void main(String[] args) {
        //참조 자료형 : 기본자료형 8가지 빼고 다 참조 자료형
        //배열, 클래스

        int[ ]a ={1};
        int[ ]b = a;

        b[0] =3;

        System.out.println("a[0] : " +a[0]);//3
        System.out.println("b[0] : " +b[0]);//3




    }
}
