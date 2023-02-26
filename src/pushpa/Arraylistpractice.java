package pushpa;

import java.util.ArrayList;

public class Arraylistpractice {

	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add("puja");
		al.add("1-april-2000");
		al.add(90);
		al.add("A");
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("puja"));
		System.out.println(al.lastIndexOf("puja"));
		System.out.println(al);
		al.set(2, 'q');
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(89));
		System.out.println(al.get(3));
		al.add("good morning");
		System.out.println(al);
		System.out.println(al.remove(1));
		System.out.println(al);
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		
	}

}
