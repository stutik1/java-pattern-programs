package hashmap;

import java.util.HashSet;
import java.util.Set;

public class Fees {
    public static Set<Student>  paidSudentList=new HashSet<>();
    public boolean hasSubmitedFee(Student s){
        return paidSudentList.contains(s);
    }

    public static void main(String[] args) {
        Student obj1 = new Student("Megha",1);
        Student obj2 = new Student("Stuti",2);
        Student obj3 = new Student("Guru",3);
        Student obj4 = new Student("Gurudev",4);
        paidSudentList.add(obj1);
        paidSudentList.add(obj2);
        paidSudentList.add(obj3);
        paidSudentList.add(obj4);
        Student megha = new Student("Megha",1);
        paidSudentList.add(megha);
        System.out.println(megha.name+" has submitted fees: "+paidSudentList.contains(megha));

    }
}