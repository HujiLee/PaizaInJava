package PaizaChallenge.moshijo.moshijo_character_7水無瀬朋の一大事;

/**
 * Created by Administrator on 2016/12/21 0021.
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://paiza.jp/moshijo/challenge/moshijo_character_7
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int countSp = Integer.parseInt(scanner.nextLine());
        HashMap<Integer, String[]> map = new HashMap<>();
        for (int i = 1; i <= countSp; i++) {
            map.put(i, scanner.nextLine().split(" "));
        }
        int countBuy = Integer.decode(scanner.nextLine());
        String[] buyIpt;
        for(byte b:new byte[countBuy]){
            buyIpt = scanner.nextLine().split(" ");
            int spCode = Integer.parseInt(buyIpt[0]);
            int buyMany = Integer.parseInt(buyIpt[1]);
            System.out.println(
                    buyMany*Integer.decode(map.get(spCode)[0])-
                            (buyMany/Integer.decode(map.get(spCode)[1]))*Integer.decode(map.get(spCode)[2])
            );
        }

    }
}
