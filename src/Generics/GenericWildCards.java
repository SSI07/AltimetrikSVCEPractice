package Generics;

import java.util.ArrayList;
import java.util.List;

class GenericsWildcards {

    public static void main(String[] args) {
        List ints = new ArrayList<>();
        ints.add(3L); ints.add(5L); ints.add(10L);
        double sum = sum(ints);
        System.out.println("Sum of ints="+sum);
    }

    public static double sum(List<?> list){
        long sum = 0;
        for (Object n:list)
            sum+=(Long)n;

        list.forEach(System.out::println);
        return sum;
    }
}
