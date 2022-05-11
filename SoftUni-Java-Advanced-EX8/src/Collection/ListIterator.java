package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListIterator implements Iterable{

    private List<String> workList;
    private int index;

    public ListIterator(List<String> workList) {
        this.workList = workList;
        if (workList.size()>0) {
            this.index = 0;
        }else {
            this.index=-1;
        }
    }

    public boolean move(){
        if (this.index<this.workList.size()-1){
            this.index++;
            return true;
        }
        return false;
    }

    public String print(){
        if (index!=-1){
            return workList.get(index);
        }
        return "Invalid Operation!";
    }

    public boolean hasNext(){
        if (this.index<this.workList.size()-1){
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    public String printAll(){
        StringBuilder sb=new StringBuilder();
        for (String el:this.workList) {
            sb.append(el);
            sb.append(" ");
        };
        return sb.toString();
    }
}
