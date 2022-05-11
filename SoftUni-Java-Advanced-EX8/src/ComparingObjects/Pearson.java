package ComparingObjects;

public class Pearson implements Comparable<Pearson> {
    private String name;
    private int age;
    private String town;
   ;

    public Pearson(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }



    @Override
    public int compareTo(Pearson other) {
        int result=this.name.compareTo(other.name);
        if (result==0) {

            result = Integer.compare(this.age, other.age);
        }
            if (result==0) {

                result = this.town.compareTo(other.town);
            }





        return result;
    }




}
