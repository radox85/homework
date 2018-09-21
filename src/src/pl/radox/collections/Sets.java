package pl.radox.collections;

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

        System.out.println("Size of pl.radox.collections.Person set: " + personSet.size());
        //sets dont have double records
        for (Person p : personSet){
            System.out.println(p);
        }
        System.out.println("Is Adam age 35 is in set: " + personSet.contains(new Person("Adam",35)));

        Set<Person> personSetSecond = new HashSet<>();
        personSetSecond.add(new Person("Zenon",21));
        personSetSecond.add(new Person("Stanisław",28));
        personSetSecond.add(new Person("Jan",20));

        personSet.addAll(personSetSecond);

        System.out.println("Size of pl.radox.collections.Person set: " + personSet.size());
        personSet.removeAll(personSetSecond);

        for (Person p : personSet){
            System.out.println(p);
        }
        System.out.println("Is empty: " + personSet.isEmpty());
        personSet.removeAll(personSet);
        System.out.println("Is empty: " + personSet.isEmpty());

    }
}
