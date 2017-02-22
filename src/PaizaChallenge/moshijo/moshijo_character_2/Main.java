package PaizaChallenge.moshijo.moshijo_character_2;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer integer = new Integer(0);
        while (scanner.hasNext()){
            integer+=Integer.decode(scanner.nextLine());
        }
        System.out.println(integer);
    }
}
