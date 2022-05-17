package ai.jobiak.collections;

import java.math.BigInteger;
import java.time.LocalDateTime;
//import java.LocalDateTime;
//import java.BigInteger;
import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet colors=new HashSet();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Pink");
		colors.add("White");
		
		System.out.println(colors);
		for(Object obj:colors) {
			System.out.println(obj);
		}
		
		LocalDateTime dt=LocalDateTime.now();
		colors.add(dt);
		colors.add(new Boolean("false"));
		colors.add(new Integer("100"));
		colors.add(new Object());
		
		Iterator iter=colors.iterator();
		while(iter.hasNext()) {
			Object obj=iter.next();
			if(obj instanceof String) {
				String str=(String)obj;//iter.next();
				System.out.println(str);
			}
			else if(obj instanceof BigInteger) {
				Integer bi=(Integer)obj;//iter.next();
				System.out.println(bi);
			}
			else if(obj instanceof Boolean) {
				Boolean bool=(Boolean)obj;
				System.out.println(bool);
			}
			else if(obj instanceof LocalDateTime) {
				LocalDateTime Idt=(LocalDateTime)obj;
				System.out.println(Idt);
			}
			else {
				System.out.println(obj);
			}
		}
		
		System.out.println(colors.size());
		System.out.println(colors.contains("Blue"));
		
	}

}
