package ai.jobiak.collections;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
	
	Course c1=new Course("BCL","Computer basics",20.0,500.0);
	Course c2=new Course("PCL","Algo",40.0,700.0);
	Course c3=new Course("Adv","Computers Tech",60.0,500.0);
	Course c4=new Course("Adv","Computers Tech",60.0,500.0);
	CourseComparator compare=new CourseComparator();
	TreeSet courseTree=new TreeSet<>(compare);
	courseTree.add(c1);
	courseTree.add(c2);
	courseTree.add(c3);
	courseTree.add(c4);
	
	//CourseComparator compare=new CourseComparator();
	//TreeSet courseTree=new TreeSet<>(compare);
	System.out.println(courseTree);
	
	
	}

}
