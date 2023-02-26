package pushpa;

import java.util.LinkedList;

public class LinkListStudy1 {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		System.out.println(ll.add("rohini"));
		System.out.println(ll.add("19-may-2000"));
		System.out.println(ll.add('a'));
		System.out.println(ll.add(null));
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		//System.out.println();
		System.out.println(ll.contains("puja"));
		System.out.println(ll.lastIndexOf(ll));
		System.out.println(ll.get(3));
		System.out.println(ll);
		System.out.println(ll.add("rama"));
		for(int i=1;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
	}

}
