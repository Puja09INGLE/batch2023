package pushpa;

import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	{
		Vector vi= new Vector();
		vi.add("puja");
		vi.add("1-april-2000");
		vi.add(90);
		vi.add("A");
		vi.add(null);
		vi.add(null);
		System.out.println(vi);
		System.out.println(vi.capacity());
		System.out.println(vi.size());
		System.out.println(vi.isEmpty());
		System.out.println(vi.contains(67));
		System.out.println(vi.indexOf("puja"));
		System.out.println(vi.get(2));
		System.out.println(vi);
		System.out.println(vi.remove(2));
		System.out.println(vi);
		Iterator i= vi.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	}

}
