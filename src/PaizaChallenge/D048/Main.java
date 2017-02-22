package PaizaChallenge.D048;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp1 = scanner.nextInt();
        int temp2 = 0;
        for(int i=1;i<=4;i++){
            temp2 = scanner.nextInt();
            System.out.println(temp2-temp1);
            temp1 = temp2;
        }


    }
}
/**
 受験結果 受験言語： Java 獲得ランク： Dランク スコア： 100点
 提出コード結果詳細

 テスト番号
 入力ケース番号	ジャッジ結果	実行時間
 テスト 1
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 2
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 3
 ケース 1（基本データ）
 通過
 0.15 秒
 テスト 4
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 5
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 6
 ケース 1（基本データ）
 通過
 0.16 秒
 テスト 7
 ケース 1（基本データ）
 通過
 0.10 秒
 テスト 8
 ケース 1（基本データ）
 通過
 0.13 秒
 テスト 9
 ケース 1（基本データ）
 通過
 0.16 秒
 テスト 10
 ケース 1（基本データ）
 通過
 0.11 秒
 */