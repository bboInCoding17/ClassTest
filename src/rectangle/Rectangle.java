package rectangle;

public class Rectangle {
    private int x1, y1, x2,y2;

    //디폴트 생성자
    public Rectangle(){
    }

    //매개변수에 값으로 변환되는 생성자
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    //사각형 넓이 구하기
    public int square(){
        return (x2-x1) * (y2-y1);//가로 * 세로
    }
    //사각형의 좌표와 넓이 등 출력
    //좌표 : (1,2),(4,5) 넓이 : 20 으로 가정
    public void show(){
        System.out.println("좌표 : ("+ x1 + ", " + y1+")"+ ", "+ "(" + x2 + ", "+ y2 + ")" + " " + "넓이 : " + square());

    }
    //Class도 참조자료형으로 매개변수에 들어 올 수 있다
    //Rectangle 자료형
    public boolean equals(Rectangle r){
        if(square() == r. square()){
           return true;
        }
        else {
            return  false;
        }
    }





}
