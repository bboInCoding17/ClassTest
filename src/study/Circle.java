package study;
public class Circle {
    private int r; // 반지름을 저장하기 위한 변수, private을 넣어주면, 변수 r에 정보 들어가는건 막음
    //

    public void setR(int r){
        if(r<0){
            this.r = 0;
        }
        else{
            this.r =r;
        }
    }
    //원 둘레 리턴 메소드 (2 *3.14*반지름(r))
    public double getSize(){
        return 2 * 3.14 *r;

    }


}
