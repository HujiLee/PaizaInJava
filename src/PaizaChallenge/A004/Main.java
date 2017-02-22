package PaizaChallenge.A004;

import java.util.*;

abstract class SNode {
    private int index = -1;
    protected int offset;
    protected SNode target;

    protected boolean goLeft() {
        return this instanceof GenNode;
    }

    protected void setIndex(int idx) {
        this.index = idx;
    }

    protected int getIndex() {
        return index;
    }

    protected int tarIndex() {
        return target.getIndex();
    }
}

class GenNode extends SNode {
    GenNode(InitNode tar) {
        tar.setTarget(this);
        this.target = tar;
        this.offset = tar.targetOffset;
    }

}

class InitNode extends SNode {
    protected int targetOffset;

    InitNode(int toff, int offset) {
        this.targetOffset = toff;
        this.offset = offset;
    }

    public void setTarget(GenNode tar) {
        this.target = tar;
    }
}


/**
 * Created by Administrator on 2016/11/16 0016.
 */
public class Main {
    static class Buff extends ArrayList<SNode> {
    }

    private static Scanner sc = new Scanner(System.in);

    static class SortByOffset implements Comparator<SNode> {
        private static SortByOffset instance = null;

        static public SortByOffset ins() {
            if (instance == null) {
                instance = new SortByOffset();
            }
            return instance;
        }

        private SortByOffset() {
        }

        @Override
        public int compare(SNode o1, SNode o2) {
            if (o1.offset > o2.offset) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    static int revGo(int lane, HashMap<Integer, Buff> gragh) {
        if (gragh.get(lane).size() == 0) {
            return lane;
        } else {
            SNode point = gragh.get(lane).get(gragh.get(lane).size() - 1).target;
            int curlane = (gragh.get(lane).get(gragh.get(lane).size() - 1).goLeft()) ? lane - 1 : lane + 1;
            while (point.getIndex() > 0) {
                if(gragh.get(curlane).get(point.getIndex()-1).goLeft()){
                    point = gragh.get(curlane).get(point.getIndex()-1).target;
                    curlane-=1;
                }else {
                    point = gragh.get(curlane).get(point.getIndex()-1).target;
                    curlane+=1;
                }
            }

            return curlane;

        }
    }

    public static void main(String[] args) {
        int len = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt();
        HashMap<Integer, Buff> gragh = new HashMap<Integer, Buff>();
        for (int i = 1; i <= n; i++) {
            gragh.put(i, new Buff());
        }

        /**
         * 插入所有InitNode
         */
        for (int i = 1; i <= m; i++) {
            int lane = sc.nextInt(), loff = sc.nextInt(), roff = sc.nextInt();
            gragh.get(lane).add(new InitNode(roff, loff));
        }

        /**
         * 生成所有GenNode
         */
        for (Map.Entry<Integer, Buff> entry : gragh.entrySet()) {
            int length = entry.getValue().size();
            for (int j = 0; j < length; j++) {
                if (entry.getValue().get(j) instanceof InitNode) {
                    gragh.get(entry.getKey() + 1).add(new GenNode((InitNode) entry.getValue().get(j)));
                }
            }
        }


        /**
         * 排序
         */
        for (Map.Entry<Integer, Buff> entry : gragh.entrySet()) {
            Collections.sort(entry.getValue(), SortByOffset.ins());
        }

        /**
         编号
         */
        for (Map.Entry<Integer, Buff> entry : gragh.entrySet()) {
            int length = entry.getValue().size();
            for (int j = 0; j < length; j++) {
                entry.getValue().get(j).setIndex(j);
            }
        }

        System.out.println(revGo(1,gragh));

    }
}


/***
 * 再チャレンジ結果サマリ

 受験結果 受験言語： Java 獲得ランク： Aランク スコア： 100点
 提出コード結果詳細

 テスト番号
 入力ケース番号	ジャッジ結果	実行時間
 テスト 1
 ケース 1（基本データ）
 通過
 0.16 秒
 テスト 2
 ケース 1（中規模データ）
 通過
 0.13 秒
 テスト 3
 ケース 1（中規模データ）
 通過
 0.15 秒
 テスト 4
 ケース 1（中規模データ）
 通過
 0.24 秒
 テスト 5
 ケース 1（中規模データ）
 通過
 0.42 秒
 テスト 6
 ケース 1（条件内の特殊なデータ）
 通過
 0.32 秒
 テスト 7
 ケース 1（中規模データ）
 通過
 0.27 秒
 テスト 8
 ケース 1（条件内の特殊なデータ）
 通過
 0.20 秒
 ケース 2（大規模データ）
 通過
 0.63 秒
 テスト 9
 ケース 1（条件内の特殊なデータ）
 通過
 0.42 秒
 ケース 2（大規模データ）
 通過
 0.77 秒
 テスト 10
 ケース 1（条件内の特殊なデータ）
 通過
 0.17 秒
 ケース 2（大規模データ）
 通過
 1.01 秒
 */
/*
7 4 5
1 3 1
3 2 2
2 3 5
3 4 4
1 6 6
 */