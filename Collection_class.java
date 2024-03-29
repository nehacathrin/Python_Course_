import java.util.*;

class Collection_class
 {
	public static void main(String[] args)
	{
		System.out.println("HELLO");
        System.out.println("--------------ArrayList------------------");

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++)
			al.add(i);

		System.out.println(al);

		al.remove(3);
		System.out.println("after removing 3rd index element");
	
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");

        System.out.println("\n -----------------------------------------\n");




        
        System.out.println("--------------LinkedList------------------");
        LinkedList<Integer> ll = new LinkedList<Integer>();
  
        // Appending new elements at end of list
        for (int i = 1; i <= 5; i++)
            ll.add(i);
  
        System.out.println(ll);
  
        ll.remove(1);
        System.out.println("after removing 1th index element");
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
        System.out.println("\n -----------------------------------------\n");




        System.out.println("--------------HashSet------------------");
        HashSet<String> hs = new HashSet<String>();
        hs.add("a");
        hs.add("b");
        hs.add("z");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
        hs.add("a");
        hs.add("b");
        System.out.println("Elements in set:");
        for (String s : hs)
            System.out.print(s + ", ");
        System.out.println();

        hs.remove("B");
        System.out.println("After removing element " + hs);
  


    }
}
