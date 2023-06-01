import java.util.Arrays;
import java.util.Scanner;

public class OverloadingPractice {
    public static Scanner scanI = new Scanner(System.in);
    public static Scanner scanS = new Scanner(System.in);
    static int [] someArray = new int[4];
    static int z;
    static boolean[] LastArrayB = new boolean[4];
    static String[] LastArrayS = new String[4];
    static int[] LastArrayI = new int[4];
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            System.out.println("Choose an integer value for position" + i);
            String v = scanS.nextLine();
            someArray[i] = Integer.parseInt(v);
        }
        System.out.println("choose an integer value");
        z = Integer.parseInt(scanI.nextLine());

        LastArrayB = alterArray(someArray, z);
        LastArrayS = alterArray(someArray, 'h');
        LastArrayI = alterArray(someArray, true);

        System.out.println(Arrays.toString(LastArrayB));
        System.out.println(Arrays.toString(LastArrayS));
        System.out.println(Arrays.toString(LastArrayI));
    }
    static String[] alterArray(int[] someArray,char c){
        String[] newArray = new String[4];
        for (int i = 0; i < 4; i++){
            String r = String.valueOf(c);

            for (int j = 0; j < someArray[i]-1; j++){
                r = r + c;
            }
            newArray[i] = r;
        }
        return newArray;
    }
    static boolean[] alterArray(int[] someArray, int x){
        boolean[] newArray = new boolean[4];
        int i = 0;

        while (i < 4){
            newArray[i] = x == someArray[i];
            i++;
        }
        return newArray;
    }
    static int[] alterArray(int[] someArray, boolean b){
        int[] newArray = new int[4];
        int x = 0;
        if (b){
            for (int i: someArray){
                newArray[x] = i * i;
                x++;
            }
        }else {
            int i = 0;
            while (i < 4){
                newArray[i] = 0;
                i++;
            }
        }
        return newArray;
    }
}
