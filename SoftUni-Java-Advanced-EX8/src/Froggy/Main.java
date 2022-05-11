package Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] input= Arrays.stream(sc.nextLine().split(", +"))
                .mapToInt(Integer::parseInt).toArray();

        Lake lake=new Lake(input);
        Iterator it=lake.iterator();
        System.out.println();

        for (int i = 0; i < input.length; i++) {
            if (i!=input.length-1) {
                System.out.print(it.next() + ", ");
            }else {
                System.out.print(it.next());
            }

        }


    }
}
