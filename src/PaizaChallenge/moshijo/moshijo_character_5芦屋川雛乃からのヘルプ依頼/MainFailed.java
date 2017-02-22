package PaizaChallenge.moshijo.moshijo_character_5芦屋川雛乃からのヘルプ依頼;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class MainFailed {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer[] encode = new Integer[9];
        /**
         * WRONG HERE
         * 10 numbers in total
         */
        for(int i = 0;i<=8;i++){
            encode[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String cmd = scanner.nextLine();
        String raw = (scanner.nextLine());
        if(cmd.equals("encode")){
            for(Character c:raw.toCharArray()){
                System.out.print(encode[Integer.valueOf(c.toString())]);
            }
        }else {
            HashMap<Integer,Integer> decodeMap = new HashMap<>();
            for(int i = 0;i<=8;i++){
                decodeMap.put(encode[i],i);
            }
            for(Character c:raw.toCharArray()){
                System.out.print(decodeMap.get(Integer.valueOf(c.toString())));
            }
        }

    }
}
/**
 Test case1	 実行時間: 0.17 秒
 Test case2	 実行時間: 0.10 秒
 Test case3 WRONG	 実行時間: 0.10 秒
 Test case4	 実行時間: - 秒
 Test case5	 実行時間: - 秒
 */