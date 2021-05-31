package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(36);
        list.add(81);
        list.add(76);
        list.add(4);
        list.add(157);

        for (int i = 0;i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        System.out.println(list);

        for (int temp : list){
            System.out.print(temp + " ");
        }

        System.out.println();

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        list.forEach((n) -> {
            System.out.print(n + " ");
        });

        System.out.println();

        list.forEach(Main::write);
        System.out.println();

        list.forEach(Main::power2);
        System.out.println();


        /*for (int temp : list){
            System.out.print(temp + " ");
            if ((temp%2)==1)
                list.remove(temp);
        }*/

        list.sort(Comparator.naturalOrder());

        list.forEach((n) -> {
            System.out.print(n + " ");
        });

        System.out.println();

        List<String> names = new ArrayList<>();

        names.add("adam");
        names.add("eva");
        names.add("richard");
        names.add("patrik");


        names.sort(Comparator.naturalOrder());

        names.forEach((n) -> {
            System.out.print(n + " ");
        });


    }
    private static int digitSum(int value){
        int temp = 0;
        while(value != 0){
            temp += value%10;
            value /= 10;
        }
        return temp;
    }

    private static void write(int m){
        System.out.print(m + " ");
    }
    private static void power2(int m){
        System.out.print(m*m + " ");
    }
}
