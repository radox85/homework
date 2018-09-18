import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        //a
        List<Person> personList = new ArrayList<>();
        //b
        personList.add(new Person("Jan", 27));
        personList.add(new Person("Adam", 35));
        personList.add(new Person("Zofia", 41));
        personList.add(new Person("Jan", 24));
        //c
        System.out.println("SIZE of Person list: \n" + personList.size());
        //d
        for (Person list : personList) {
            System.out.println(list);
        }
        //e
        System.out.println("\nList contains Jan age 20: " + personList.contains(new Person("Jan", 20)));
        //f
        System.out.println("\nZofia age 41 on position: " + (personList.indexOf(new Person("Zofia", 41)) + 1));
        //g
        Collections.sort(personList);
        System.out.println("\nSorted list:");
        for (Person list : personList) {
            System.out.println(list);
        }
        //h
        personList.remove(new Person("Adam",35));
        //i
        System.out.println("List is empty: " + personList.isEmpty());
        System.out.println("SIZE of Person list: \n" + personList.size());
        for (Person list : personList) {
            System.out.println(list);
        }




    }
}
