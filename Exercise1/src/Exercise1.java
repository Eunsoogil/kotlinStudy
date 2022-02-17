import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise1 {

    public static void main(String[] args) {
        JavaPerson john = new JavaPerson(1L, "Mr", "John","Blue", new GregorianCalendar(1977, 9, 3));
        JavaPerson jane = new JavaPerson(2L, "Mrs", "Jane","Green", null);
        System.out.println(john.equals(new JavaPerson(1L, "Mr", "John","Blue", new GregorianCalendar(1977, 9, 3))));
        System.out.println(john.equals(jane));
        System.out.println(john.equals(null));
        System.out.println(jane.hashCode());
        System.out.println(john + "'s age is " + john.getAge());
        System.out.println(jane + "'s age is " + jane.getAge());
        System.out.println(JavaPerson.getAge(new GregorianCalendar(1988,5,3)));
    }

}
