package PaizaChallenge.moshijo.moshijo_character_9緑川つばめを窮地から救え;


import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
class Calc{
    /**
     *
     * @param digit 0 to N 0表示不四舍五入
     * @param targetNumber
     * @return
     */
    static private int sswrIn(int digit,int targetNumber){
        return (int) (Math.round(targetNumber/Math.pow(10,digit))*Math.pow(10,digit));
    }

    static private int maxSswr(String targetNumber){
        int above5Index=-1;
        int numberLength = targetNumber.length();
        for(int i = 0;i<numberLength;i++){
            if(Integer.decode(targetNumber.substring(i,i+1))>=5){
                above5Index = i;
                break;
            }
        }
        if(above5Index<0){
            return Integer.decode(targetNumber);
        }else{
            return maxSswr(
                    String.valueOf(
                            sswrIn(numberLength-above5Index,Integer.valueOf(targetNumber))
                    )
            );
        }
    }
    private String number;
    private Integer maxSswr = null;

    public Calc(String number) {
        this.number = number;
    }

    public void print(){
        if(this.maxSswr==null){
            this.maxSswr = maxSswr(number);
        }
        System.out.println(this.maxSswr);
    }



}
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Calc calc = new Calc(scanner.nextLine());
        calc.print();


    }
}
/**
 Test case1	 実行時間: 0.10 秒
 Test case2	 実行時間: 0.11 秒
 Test case3	 実行時間: 0.17 秒
 Test case4	 実行時間: 0.10 秒
 Test case5	 実行時間: 0.10 秒
 */