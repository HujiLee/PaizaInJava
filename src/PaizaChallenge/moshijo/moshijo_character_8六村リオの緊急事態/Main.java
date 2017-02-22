package PaizaChallenge.moshijo.moshijo_character_8六村リオの緊急事態;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
class Folder {
    private LinkedList<String> list = new LinkedList<>();

    public Folder() {
        this.list.add("");
    }

    public void add(String next) {
        this.list.add(next);
    }

    public void up() {
        if (this.list.size() > 1) {
            list.pollLast();
        } else {
            //do nothing
        }
    }

    public void print() {
        int size = list.size();

        if (size > 1) {
            for (ListIterator<String> it = list.listIterator(); it.hasNext(); ) {
                if (it.nextIndex() == 0) {

                } else {
                    System.out.print("/");
                }
                System.out.print(it.next());
            }
        } else {
            System.out.print('/');
        }

        System.out.println();

    }
}

public class Main {
    public static void main(String[] args) {
        String[] input = (new Scanner(System.in)).nextLine().split(" ");
        assert (input.length == 2);
        String originPath = input[0];
        Folder initFolder;
        if (originPath.equals("/")) {
            initFolder = new Folder();
        } else {
            initFolder = new Folder();
            for (String s : originPath.substring(1).split("/")) {
                initFolder.add(s);
            }
        }
        for (String s : input[1].split("/")) {
            if (s.equals("..")) {
                initFolder.up();
            } else if(s.equals("."))  {
                //do nothing
                /**
                 * 原先就是没考虑到这个!
                 */
            }else {
                initFolder.add(s);
            }
        }
        initFolder.print();


    }
}

/**
 * 从第一个就是错的
 * Test case1	 実行時間: 0.11 秒
 * Test case2	 実行時間: - 秒
 * Test case3	 実行時間: - 秒
 * Test case4	 実行時間: - 秒
 * Test case5	 実行時間: - 秒
 */
