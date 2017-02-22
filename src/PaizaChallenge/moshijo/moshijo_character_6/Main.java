package PaizaChallenge.moshijo.moshijo_character_6;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = Integer.parseInt(scanner.nextLine());
        Integer[] row = new Integer[count];
        Integer[] col = new Integer[count];
        for (int i = 0; i < count; i++) {
            row[i] = scanner.nextInt();
        }
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            col[i] = scanner.nextInt();
        }
        for(Integer i:col){
            for(int o=0;o<count;o++){
                System.out.print(i+row[o]);
                if(o<count-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
