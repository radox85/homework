import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();
        //"Jan", 20 lat; "Adam", 35 lat; "Jan", 20 lat; "Jan", 20 lat; "Zofia", 41 lat.
        personSet.add(new Person("Jan", 20));
        personSet.add(new Person("Adam",35));
        personSet.add(new Person("Jan",20));
        personSet.add(new Person("Jan",20));
        personSet.add(new Person("Zofia",41));

        System.out.println("Size of Person set: " + personSet.size());
        //sets dont have double records
        for (Person p : personSet){
            System.out.println(p);
        }
        System.out.println("Is Adam age 35 is in set: " + personSet.contains(new Person("Adam",35)));
       // Stwórz nowy zbiór obiektów typu Person i dodaj do niego takie obiekty: "Zenon", 21 lat; "Stanisław",
        // 28 lat, "Jan", 20 lat. Wypisz rozmiar tego zbioru.
        Set





    }
}
