import java.util.ArrayList;

public class LearningArrayList {
	public static void main(String[] args) {
		// Arraylists can contain only objects
		
		// Declaring arraylist of strings
		
		ArrayList<String> list = new ArrayList<String>();
		
		// add appends to the end of the list
		
		list.add("Eden");
		list.add("Allen");
		list.add("Michael");
		
		// to traverse the list
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// to remove an item, use remove
		// all items after are moved down
		
		list.remove(1);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} // Michael will be in index 1
		
		// set allows you to replace an item
		// it returns the item you removed
		
		System.out.println("Set returns " + list.set(1, "Adam"));
		
		// primitive data like int, can be used in an ArrayList
		// due to autoboxing
		
		Integer i1 = new Integer (1);
		Integer i2 = new Integer (2);
		
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(i1);
		ilist.add(i2);
		ilist.add(new Integer (3));
		ilist.add(7);
		
		// Most common ArrayList error
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add("Jack");
		list.add("Adam");
		list.add("Adam");
		list.add("Ian");
		list.add("Adam");
	}
}
