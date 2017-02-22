package PaizaChallenge.C036;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/24 0024.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] round1 = scanner.nextLine().split(" ");
        String[] round2 = scanner.nextLine().split(" ");
        String[] scores1 = scanner.nextLine().split(" ");
        String[] scores2 = scanner.nextLine().split(" ");
        int[] maxIn1 = new int[]{
                round1Max(Integer.decode(round1[0]), Integer.decode(round1[1]), scores1),
                round1Max(Integer.decode(round2[0]), Integer.decode(round2[1]), scores1)
        };
        if (maxIn1[0] > maxIn1[1]) {
            int temp = maxIn1[0];
            maxIn1[0] = maxIn1[1];
            maxIn1[1] = temp;
        }
        if(Integer.decode(scores2[0])>Integer.decode(scores2[1])){
            System.out.println(maxIn1[1]);
            System.out.println(maxIn1[0]);
        }else {
            System.out.println(maxIn1[0]);
            System.out.println(maxIn1[1]);
        }


    }

    static int round1Max(int i1, int i2, String[] scores1) {
        if (Integer.decode(scores1[i1 - 1]) < Integer.decode(scores1[i2 - 1])) {
            return i1;
        } else {
            return i2;
        }
    }

}
/**
 提出コード結果詳細

 テスト番号
 入力ケース番号	ジャッジ結果	実行時間
 テスト 1
 ケース 1（基本データ）
 通過
 0.12 秒
 テスト 2
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 3
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 4
 ケース 1（基本データ）
 通過
 0.16 秒
 テスト 5
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 6
 ケース 1（基本データ）
 通過
 0.09 秒
 テスト 7
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 8
 ケース 1（基本データ）
 通過
 0.15 秒
 テスト 9
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 10
 ケース 1（基本データ）
 通過
 0.09 秒
 */