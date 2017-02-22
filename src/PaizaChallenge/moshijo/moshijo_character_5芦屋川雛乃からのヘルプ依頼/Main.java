package PaizaChallenge.moshijo.moshijo_character_5芦屋川雛乃からのヘルプ依頼;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] encode = scanner.nextLine().split(" ");
        String cmd = scanner.nextLine();
        char[] raw = scanner.nextLine().toCharArray();
        if(cmd.equals("encode")){
            for(char c:raw){
                System.out.print(encode[Integer.decode(String.valueOf(c))]);
            }
            System.out.println();
        }else {
            HashMap<String,Integer> decode = new HashMap<>();
            for(int i = 0;i<encode.length;i++){
                decode.put(encode[i],i);
            }
            for(char c:raw){
                System.out.print(decode.get(String.valueOf(c)));
            }
            System.out.println();
        }


    }
}
