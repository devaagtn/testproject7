import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Studentexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> mylist1 = new ArrayList<Student>();
List<Student> mylist2 = new ArrayList<Student>();
List<Student> mylist3 = new ArrayList<Student>();
Map<Integer,String> mymap1 = new HashMap<Integer,String>();
Map<Integer,String> mymap2 = new HashMap<Integer,String>();
mylist1.add(new Student(23,75,"deva",79));
mylist1.add(new Student(43,80,"kal",97));
mylist1.add(new Student(56,67,"ved",80));
mylist1.add(new Student(75,93,"dkr",76));
mylist1.add(new Student(89,68,"den",81));
System.out.println(mylist1);
//mylist1.stream().filter(k->k.getName().startsWith("d")).
//collect(Collectors.toMap(s->s.getRollno(),k->k.getName())).forEach((k,v)->System.out.println(k+" "+v));
 mylist1.stream().filter(k->k.getMarks()>70).
collect(Collectors.toMap(Student::getRollno,Student::getName)).forEach((k,v)->System.out.println(k+" "+v));
for(Student s : mylist1)
	if(s.getMarks()>70) {
		mymap1.put(s.getRollno(), s.getName());
	}
System.out.println(mymap1);
	}

}
