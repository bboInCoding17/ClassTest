package test7_10;

public class Student {
    private String name;
    private int age;
    private String addr;
    private String studentNum;
    private String teleNum;

    public Student(String name, int age, String addr, String studentNum, String teleNum) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.studentNum = studentNum;
        this.teleNum = teleNum;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddr(String addr){
        this.addr=addr;
    }
    public String getAddr(){
        return addr;
    }
    public void setStudentNum(String studentNum){
        this.studentNum = studentNum;
    }
    public String getStudentNum(){
        return studentNum;
    }
    public void setTeleNum(String teleNum){
        this.teleNum = teleNum;
    }
    public String getTeleNum(){
        return teleNum;
    }

    public void showInfo(){
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age );
        System.out.println("주소 :" + addr);
        System.out.println("학번 :" + studentNum );
        System.out.println("전화번호 :" + teleNum);

    }





}
