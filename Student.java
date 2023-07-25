import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    public int prn;
    public String name;
    public String course;
    
	public Student(int prn, String name, String course) {
		super();
		this.prn = prn;
		this.name = name;
		this.course = course;
	}
	
	

	@Override
	public String toString() {
		return prn + " " + name + " " + course;
	}



	public static void main(String[] args) {
		List<Student> student=new ArrayList<Student>();
		student.add(new Student(1,"Akash","DAC"));
		student.add(new Student(2,"Prathamesh","DAI"));
		student.add(new Student(3,"Saurabh","DBDA"));
		student.add(new Student(4,"Prakash","DITISS"));
		
		Iterator<Student> itr=student.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
