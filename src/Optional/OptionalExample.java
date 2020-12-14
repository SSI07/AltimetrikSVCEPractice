package Optional;
import java.awt.*;
import java.util.*;
import java.util.List;

public class OptionalExample {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        int rno=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        Student s1=new Student(rno,name);
       */

        Student s2=new Student(2,null);
        System.out.println(s2.getRno()+"-"+s2.getName());


        String[] str = new String[10];
        ArrayList<Integer> i=new ArrayList<>(List.of(1,2,4));
        Optional<Integer> check=Optional.ofNullable(i.get(2));
        System.out.println(check.orElse(1));

       // str[5]="joe";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");

        String s=checkNull.orElse("Null cannot be present");
        System.out.println(s);
    }
}
