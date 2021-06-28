package ArraysAndStrings;

import java.util.BitSet;
import java.util.Scanner;

public class ArraysAndStrings1 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        BitSet bitSet = new BitSet();

        boolean[] charCheck = new boolean[128];
        for(char s : text.toCharArray()){
            int check = s;
            if(!charCheck[check]){
                charCheck[check] = true;
            } else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }



}
