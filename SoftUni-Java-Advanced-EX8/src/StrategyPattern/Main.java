package StrategyPattern;

import javax.lang.model.element.Name;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Pearson> pep1=new TreeSet<>(new NameComparator());
        Set<Pearson> pep2=new TreeSet<>(new AgeComparator());



        int lines=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {

            String[] info = sc.nextLine().split("\\s+");
            int cAge = Integer.parseInt(info[1]);
            Pearson current = new Pearson(info[0], cAge);
            pep1.add(current);
            pep2.add(current);
        }

        for (Pearson p:pep1) {
            System.out.printf("%s %d%n",p.getName(),p.getAge());
        }
        for (Pearson p:pep2) {
            System.out.printf("%s %d%n",p.getName(),p.getAge());
        }





    }
}
