package Optional;

import java.util.Optional;

class Student implements Comparable<Student>{
    private int rno;
    private String name;

    public Student(int rno, String name) {
        Optional<String> s=Optional.ofNullable(name);
        this.rno = rno;
        this.name = s.orElseThrow(()->new IllegalArgumentException("Cannot be null"));
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if(o.rno<this.rno)
            return -1;
        return 1;
    }
}
