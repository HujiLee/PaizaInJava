package PaizaChallenge.B024;

import java.util.*;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
abstract class Any {
}

class Grid extends Any {
    private int x;
    private int y;
    private Grid upG = null;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Grid UpG() {
        if (this.upG == null) {
            this.upG = new Grid(x, y + 1);
        }
        return this.upG;
    }

    private double minRadius() {
        return Math.sqrt(x * x + y * y);
    }

    private double maxRadius() {
        return Math.sqrt(Math.pow(x + 1, 2) + Math.pow(y + 1, 2));
    }

    public boolean isTouched(double r) {
        return r > minRadius();
    }

    public boolean isIn(double r) {
        return r > maxRadius();
    }

    public static Grid specialGrid(int x$y) {
        return new Grid(x$y, x$y);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        LinkedList<Grid> specialGrids = new LinkedList<Grid>();
        {
            int xy = 0;
            Grid tmpGrid = Grid.specialGrid(xy);
            do {
                specialGrids.add(tmpGrid);
                xy++;
                tmpGrid = Grid.specialGrid(xy);
            }while (tmpGrid.isTouched(r));
        }
        LinkedList<LinkedList<Grid>> otherGrids = new LinkedList<LinkedList<Grid>>();
        {
            for(int i =0;i<specialGrids.size();i++){
                otherGrids.add(new LinkedList<Grid>());
            }
        }
        {
            for(int i =0;i<specialGrids.size();i++){
                Grid thisG = specialGrids.get(i);
                while (thisG.UpG().isTouched(r)){
                    otherGrids.get(i).add(thisG.UpG());
                    thisG = thisG.UpG();
                }
            }
        }
        int otherCount = 0;
        {
            for(int i =0;i<otherGrids.size();i++){
                otherCount+=otherGrids.get(i).size();
            }
        }
        System.out.println(otherCount*8+specialGrids.size()*4);


    }
}
/*
再チャレンジ結果サマリ

受験結果 受験言語： Java 獲得ランク： Bランク スコア： 100点
提出コード結果詳細

テスト番号
入力ケース番号	ジャッジ結果	実行時間
テスト 1
ケース 1（基本データ）
通過
0.11 秒
テスト 2
ケース 1（基本データ）
通過
0.11 秒
テスト 3
ケース 1（基本データ）
通過
0.12 秒
テスト 4
ケース 1（基本データ）
通過
0.12 秒
テスト 5
ケース 1（基本データ）
通過
0.12 秒
テスト 6
ケース 1（基本データ）
通過
0.12 秒
テスト 7
ケース 1（基本データ）
通過
0.12 秒
テスト 8
ケース 1（基本データ）
通過
0.15 秒
テスト 9
ケース 1（条件内の特殊なデータ）
通過
0.35 秒
テスト 10
ケース 1（条件内の特殊なデータ）
通過
0.26 秒
 */
