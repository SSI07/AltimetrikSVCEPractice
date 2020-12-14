package Collections_comparator_comparable;

import java.util.*;

class coll{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("bmw");
        cars.add("Ford");
       // cars.add(1);
      //  cars.remove(0);
        System.out.println(cars.contains("BMW"));
        System.out.println(cars);

        Map<Integer,Student > v=new HashMap<Integer,Student>();
        v.put(1,new Student(1,"a"));
        v.put(2,new Student(4,"f"));
        v.put(3,new Student(3,"z"));

/*
        Comparator<Comparable.Student> com=new Comparator<Comparable.Student>() {
            @Override
            public int compare(Comparable.Student o1, Comparable.Student o2) {
                if(o1.rno>o2.rno)
                    return 1;
                return -1;
            }
        };*/
        //List<Comparable.Student> l1=new ArrayList<Comparable.Student>(v);
        //Set<Comparable.Student> s1=new HashSet<Comparable.Student>(l1);
        //l1.addAll(v);
        /*Collections.sort(v, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.rno<o2.rno)
                    return -1;
                return 1;
            }
        });*/

      /*  System.out.println(s1.getClass());
        s1.forEach(System.out::println);
*/
        List list = new LinkedList(v.entrySet());
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });/*
        for (Map.Entry<Integer, Student> entry : list.entrySet()) {
            System.out.println( entry.getKey()+" - "+entry.getValue());
           // System.out.println();
        }*/
        list.forEach(System.out::println);


        /*v.addAll(cars);
        cars.set(3,"slsl");
        cars.clear();
        System.out.println(cars);
        System.out.println(v);
       */ //System.out.println(cars.get(0));

        Deque<Student> d=new ArrayDeque<Student>();
        d.addFirst(new Student(1,"ss"));

        Map<String,Student> m=new TreeMap<String, Student>();
        m.put("s",new Student(1,"ssi"));
        m.put("s1",new Student(2,"ssi2"));
      //  System.out.println(m.get("s1"));




    }
}

