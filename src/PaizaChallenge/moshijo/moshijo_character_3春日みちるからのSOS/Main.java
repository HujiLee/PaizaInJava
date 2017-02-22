package PaizaChallenge.moshijo.moshijo_character_3春日みちるからのSOS;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String ipt = scanner.nextLine();
        if(ipt.indexOf("help")>=0){
            System.out.println("SOS");
        }else {
            System.out.println(ipt);
        }

    }
}
