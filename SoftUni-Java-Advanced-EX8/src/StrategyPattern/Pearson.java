package StrategyPattern;

public class Pearson implements Comparable<Pearson> {
    private String name;
    private int age;

   ;

    public Pearson(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Pearson other) {
        int result=this.name.compareTo(other.name);
        if (result==0) {

            result = Integer.compare(this.age, other.age);
        }


        return result;
    }




}
