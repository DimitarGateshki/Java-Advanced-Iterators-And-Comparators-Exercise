package StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Pearson> {
   @Override

    public int compare(Pearson p1,Pearson other) {
        int result=Integer.compare(p1.getName().length(),other.getName().length());
        if(result==0){
            result=p1.getName().toLowerCase().charAt(0)-other.getName().toLowerCase().charAt(0);
        }
        return result;
    }



}
