package rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();//(0,0) (0,0)
        Rectangle s = new Rectangle(1, 1, 2, 3);//(1,1) (2,3)

        r.show();//좌표 : (0, 0), (0, 0) 넓이 : 0
        s.show();//좌표 : (1, 1), (2, 3) 넓이 : 2
        System.out.println(s.square());// 2
        r.set(-2, 2, -1, 4);//(-2, 2) (-1,4)
        r.show();//좌표 : (-2, 2), (-1, 4) 넓이 : 2
        System.out.println(r.square());// 2


        //대입할 때 자료형이 같을 때 가능
        if(r.equals(s)){
            System.out.println("두 사각형의 넓이는 같습니다.");
        }
    }
}
