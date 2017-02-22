package PaizaChallenge.B037_2017年お正月問題幸運な1年;



import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
class MyDate{
    static public String sort(String rawId){
        assert (rawId.length()==4);
        char[] arr = rawId.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
    final public String id;

    MyDate(int month,int day) {
        String m = String.valueOf(month);
        if(month<10){
            m = "0"+m;
        }
        String d = String.valueOf(day);
        if(day<10){
            d = "0"+d;
        }
        String id = m+d;
        id  = sort(id);
        this.id = id;
    }
}
class RamSimu{
    public int getN() {
        return n;
    }
    private int n = 0;
    private int wn = 0,xn = 0,yn = 0,zn = 0;
    public final int[] as,bs,ms;


    RamSimu(int[] as, int[] bs, int[] ms) {
        this.as = as;
        this.bs = bs;
        this.ms = ms;
    }

    void calc(){
        wn = (as[0]*wn+bs[0])%ms[0];
        xn = (as[1]*xn+bs[1])%ms[1];
        yn = (as[2]*yn+bs[2])%ms[2];
        zn = (as[3]*zn+bs[3])%ms[3];
        n++;
    }

    @Override
    public String toString() {
        String id = wn%10+""+xn%10+zn%10+yn%10;
        id = MyDate.sort(id);
        return id;
    }
}

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static MyDate geyDateFromIn(String in){
        String[] arr = in.split(" ");
        return new MyDate(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
    }
    static int[] s2ints(String line){
        String[] arr = line.split(" ");
        int[] ints = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            ints[i] = Integer.valueOf(arr[i]);
        }
        return ints;
    }
    static RamSimu getSimuFromIn(String as,String bs,String ms){
        return new RamSimu(s2ints(as),s2ints(bs),s2ints(ms));
    }
    public static void main(String[] args) {
        MyDate myDate = geyDateFromIn(scanner.nextLine());
        RamSimu ramSimu = getSimuFromIn(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        while (!myDate.id.equals(ramSimu.toString())){
            ramSimu.calc();
        }
        System.out.println(ramSimu.getN());




    }
}
