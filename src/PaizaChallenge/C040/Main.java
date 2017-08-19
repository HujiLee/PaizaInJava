package PaizaChallenge.C040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/19 0019.
 */
public class Main {
//    private static StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//    private static int getInt() throws IOException {
//        streamTokenizer.nextToken();
//        return (int) streamTokenizer.nval;
//    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final int N = Integer.parseInt(scanner.nextLine());
        double ceil = Double.MAX_EXPONENT,floor = Double.MIN_EXPONENT;
        String[] ipts;
        Double temp;
        for(int i =1;i<=N;i++){
            ipts = scanner.nextLine().split(" ");
            temp = Double.valueOf(ipts[1]);
            if(ipts[0].equals("le")){
               if(temp<ceil){
                   ceil = temp;
               }
            }else{
                if(temp>floor){
                    floor = temp;
                }
            }
        }
        System.out.println(floor+" "+ceil);


    }
}
/*
Hujimiya-kun さんの受験結果 ニックネームを設定する

問題：C040:【ロジサマコラボ問題】背比べ
受験結果  受験言語： Java 回答時間： 9分10秒 バイト数： 1244 Byte スコア： 100点
問題集計 受験者数： 3,318人 正解率： 83.39％ 平均回答時間： 18分48秒 平均スコア： 74.27点
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
0.11 秒
テスト 4
ケース 1（基本データ）
通過
0.11 秒
テスト 5
ケース 1（境界値データ）
通過
0.10 秒
ケース 2（基本データ）
通過
0.10 秒
テスト 6
ケース 1（境界値データ）
通過
0.18 秒
ケース 2（基本データ）
通過
0.10 秒
テスト 7
ケース 1（境界値データ）
通過
0.11 秒
ケース 2（基本データ）
通過
0.10 秒
テスト 8
ケース 1（境界値データ）
通過
0.10 秒
ケース 2（基本データ）
通過
0.10 秒
テスト 9
ケース 1（境界値データ）
通過
0.18 秒
ケース 2（基本データ）
通過
0.11 秒
テスト 10
ケース 1（基本データ）
通過
0.11 秒
 */