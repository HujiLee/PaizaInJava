package PaizaChallenge.A017_落ちものシミュレーション;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * Created by Administrator on 2017/8/19 0019.
 */

/**
 * https://paiza.jp/challenges/123/page/problem
 */
class GameBoard{
    private static final char VOID = '.',OCCUP = '#';
    private final int WIDTH;
    private final int HEIGHT;
    private char[][] graph;

    public GameBoard(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        graph = new char[WIDTH][HEIGHT];
        for(char[] arr : graph){
            for(int i = 0;i<arr.length;i++){
                arr[i] = VOID;
            }
        }
    }

    public void drop(int hi,int wi, int offsetx){
        int bottom=-1;
        for(int i = HEIGHT-1;i>=0;i--){
            for(int j=offsetx;j<=offsetx+wi-1;j++){
                if(graph[j][i]==OCCUP){
                    bottom = i+1;
                    break;
                }
            }
            if(bottom!=-1){
                break;
            }
        }
        if(bottom==-1){
            bottom = 0;
        }
        for(int i = bottom;i<=bottom+hi-1;i++){
            for(int j=offsetx;j<=offsetx+wi-1;j++){
                graph[j][i] = OCCUP;
            }
        }

    }

    @Override
    public String toString() {
         String graphstr ="";
         for(int i = HEIGHT-1;i>=0;i--){
             for(int j=0;j<WIDTH;j++){
                 graphstr += graph[j][i];
             }
             graphstr+="\n";
         }
         return graphstr;
    }
}


public class Main {
    private static StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    private static int getInt() throws IOException {
        streamTokenizer.nextToken();
        return (int) streamTokenizer.nval;
    }

    public static void main(String[] args) throws IOException {
        final int H =getInt(),W = getInt(),N = getInt();
        GameBoard gameBoard = new GameBoard(W,H);
        for(int i = 1;i<=N;i++){
            gameBoard.drop(getInt(),getInt(),getInt());
        }
        System.out.println(gameBoard);

    }
}
/*
 再チャレンジ結果サマリ

 受験結果 受験言語： Java 獲得ランク： Aランク スコア： 100点
 提出コード結果詳細

 テスト番号
 入力ケース番号	ジャッジ結果	実行時間
 テスト 1
 ケース 1（基本データ）
 通過
 0.07 秒
 テスト 2
 ケース 1（基本データ）
 通過
 0.07 秒
 テスト 3
 ケース 1（基本データ）
 通過
 0.09 秒
 テスト 4
 ケース 1（基本データ）
 通過
 0.08 秒
 テスト 5
 ケース 1（基本データ）
 通過
 0.09 秒
 テスト 6
 ケース 1（基本データ）
 通過
 0.07 秒
 テスト 7
 ケース 1（基本データ）
 通過
 0.07 秒
 テスト 8
 ケース 1（境界値データ）
 通過
 0.07 秒
 ケース 2（基本データ）
 通過
 0.09 秒
 テスト 9
 ケース 1（境界値データ）
 通過
 0.08 秒
 ケース 2（基本データ）
 通過
 0.09 秒
 テスト 10
 ケース 1（境界値データ）
 通過
 0.08 秒
 ケース 2（基本データ）
 通過
 0.07 秒
 */