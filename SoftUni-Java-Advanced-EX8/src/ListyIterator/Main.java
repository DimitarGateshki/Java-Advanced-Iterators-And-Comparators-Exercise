package ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> data= Arrays.stream(sc.nextLine().split("\\s+")).skip(1)
                .collect(Collectors.toCollection(ArrayList::new ));
        String input=sc.nextLine();

        ListIterator iter=new ListIterator(data);



        while (!input.equals("END")){
            switch (input){

                case "Move":
                    System.out.println(iter.move());
                    break;
                case "Print":
                    System.out.println(iter.print());
                    break;
                case "HasNext":
                    System.out.println(iter.hasNext());
                    break;

            }
            input=sc.nextLine();
        }
    }
}
