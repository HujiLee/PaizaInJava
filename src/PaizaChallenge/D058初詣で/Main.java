package PaizaChallenge.D058初詣で;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] in = scanner.nextLine().split(" ");
        for(byte b:new byte[Integer.parseInt(in[0])]){
            System.out.print("A");
        }
        for(byte b:new byte[Integer.parseInt(in[1])]){
            System.out.print("B");
        }
        for(byte b:new byte[Integer.parseInt(in[2])]){
            System.out.print("A");
        }
        System.out.println();
    }
}
