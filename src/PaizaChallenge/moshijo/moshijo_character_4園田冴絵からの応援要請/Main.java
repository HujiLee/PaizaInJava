package PaizaChallenge.moshijo.moshijo_character_4園田冴絵からの応援要請;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int calc(int num1,int num2,String op){
        switch (op){
            case "+":return num1+num2;
            case "-":return num1-num2;
        }
        return num1;
    }
    public static void main(String[] args) {
        String[] strings = scanner.nextLine().split(" ");
        System.out.println(
                calc(Integer.decode(strings[0]),Integer.decode(strings[1]),strings[2])
        );


    }
}
