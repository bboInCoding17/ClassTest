package study;

import javax.sound.midi.Soundbank;

public class CallByValue {
    public static void main(String[] args) {
        int a =10;
        int b =a; // b = 10
        b=3;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

    }


}
