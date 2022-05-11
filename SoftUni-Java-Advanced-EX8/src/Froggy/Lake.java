package Froggy;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Lake implements Iterable<Integer> {
    private int[] stones;

    public Lake(int[] stones) {
        this.stones = stones;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int current=0;
            private int lastEven=stones.length%2==0 ? stones.length-2 :stones.length-1;


            @Override
            public boolean hasNext() {
                return this.current<stones.length;
            }


            @Override
            public Integer next(){
                if (this.current==lastEven){
                    int el=stones[lastEven];
                    this.current=1;
                    return el;
                }
                int el=stones[current];
                this.current+=2;

                return el;

            }


            };


        }
    }


