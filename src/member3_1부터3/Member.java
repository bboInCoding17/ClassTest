package member3_1부터3;

public class Member {
    String name;
    String id;
    String pw;

    public Member(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public String getPw(){
        return pw;
    }

    public void displayInfo(){
        System.out.println("이름 " + name);
        System.out.println("아이디 " + id);
        System.out.println("비밀번호 " + pw);
    }


}
