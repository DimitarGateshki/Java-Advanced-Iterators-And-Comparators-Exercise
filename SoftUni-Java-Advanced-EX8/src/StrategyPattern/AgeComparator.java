package StrategyPattern;

import java.util.Comparator;

public class AgeComparator implements Comparator<Pearson> {
    @Override
    public int compare(Pearson p1,Pearson other) {

        return p1.getAge()-other.getAge();
    }


}
