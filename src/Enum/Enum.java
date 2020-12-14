package Enum;

enum Day{
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(3), FRIDAY(4), SATURDAY(5);
    int no;
    Day(int i) {
        this.no=i;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }
};

public class Enum {
        public static void main(String args[]){
            Day day=Day.MONDAY;

            System.out.println(Day.valueOf("SUNDAY"));
            //System.out.println(Day.values());
            Day[] days=Day.values();
            for (Day day1 : days) {
                System.out.println(day1);
            }
            switch(day){
                case SUNDAY:
                    System.out.println("sunday");
                    System.out.println(day.getNo());
                    break;
                case MONDAY:
                    System.out.println("monday");
                    day.setNo(3);
                    System.out.println(day.getNo());
                    break;
                default:
                    System.out.println("other day");
            }
        }
    }

