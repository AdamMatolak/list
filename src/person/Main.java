package person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Viliam","Horvath",'m',32));
        list.add(new Person("Andrej","Chrcheľ",'m',42));
        list.add(new Person("Štefan","Šikovný",'m',53));
        list.add(new Person("Edward","Gádži",'m',19));
        list.add(new Person("Kristián","Malý",'m',26));
        list.add(new Person("Braňo","Mojsej",'m',53));
        list.add(new Person("Drahomír","Procházka",'m',84));
        list.add(new Person("Jaromír","Jágr",'m',58));
        list.add(new Person("Dušan","Horvath",'m',32));
        list.add(new Person("Zdena","Studenková",'f',520));



        sortByAge(list);
        list.forEach(Main::print);



    }

    private static void print(Person person){
        System.out.println(person.getFname() + " " + person.getLname() + " " + person.getGender() + " " + person.getAge());
    }

    private static void sortByAge(List list){
        list.sort(Comparator.comparing(Person::getAge));
    }
}
