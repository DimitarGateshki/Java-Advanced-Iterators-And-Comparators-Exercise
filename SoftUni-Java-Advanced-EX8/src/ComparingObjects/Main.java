package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Pearson> people=new ArrayList<>();


        String input=sc.nextLine();
        while (!input.equals("END")){
            String[] info=input.split("\\s+");
            int cAge=Integer.parseInt(info[1]);
            Pearson current=new Pearson(info[0],cAge,info[2]);
            people.add(current);

            input= sc.nextLine();
        }
        int index= Integer.parseInt(sc.nextLine());
        if (index<people.size()+1) {
            Pearson comP = people.get(index - 1);
            people.remove(index - 1);

            int sameCount = 1;

            for (Pearson p : people) {
                int compare = comP.compareTo(p);
                if (compare == 0) {
                    sameCount++;
                }
            }

            int nonSame = people.size() + 1 - sameCount;

            if (sameCount == 1) {
                System.out.println("No matches");
            } else {
                System.out.printf("%d %d %d", sameCount, nonSame, people.size() + 1);


            }
        }else {
            System.out.println("No matches");
        }



    }
}
