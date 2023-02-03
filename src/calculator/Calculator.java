package calculator;

public class Calculator {
    int num1,num2;

//    public Calculator(int num1, int num2){
//        this.num1 = num1;
//        this.num2 = num2;

//    }

    public String add(int num1 , int num2){
        return num1 + num2 + "";
    }
    public String minus(int num1, int num2){
        int max =0;
        int min =0;
        if(num1>num2){
            max = num1;
            min =num2;
        }
        else if(num2>num1){
            max = num2;
            min =num1;
        }
        return max-min+ "";

    }
    public String mul(int num1, int num2){
        return num1 * num2+ "";
    }

    public String div(int num1, int num2){
        return num1 / num2+ "";
    }

}
