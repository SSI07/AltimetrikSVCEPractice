package Collections_comparator_comparable;

class Student implements Comparable<Student>{
    int rno;
    private String name;

    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
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
