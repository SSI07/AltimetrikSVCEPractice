package SET;
import java.util.*;
class TreeSet1{
    public static void main(String args[]){
        //Creating and adding elements

        Set<String> al=new TreeSet<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        List<String> l=new ArrayList<>(al);
        //l.sort();

        Collections.sort(l,  new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2)>1) {
                    //System.out.println(o1.compareTo(o2));
                    return -1;
                }
                return 1;


            }

        });
        Iterator<String> itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
