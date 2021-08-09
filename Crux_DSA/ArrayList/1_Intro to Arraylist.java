import java.util.*;
public class ArrayList_Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=100;
		Integer i =100;
		System.out.println(a);
		System.out.println(i);
		a= i;// Integer se int  Unboxing 
		byte a1=(byte)a;
		int arr [] = null;
		System.out.println(arr);
		i=a;// int se Integer autoboxing 
		ArrayList<Integer> list= new ArrayList<>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		System.out.println(list); // Index --- > 0 to list.size();
        System.out.println("add will add the element in the specified position and shifts the existing elements to right side of the array");
		list.add(2,90);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
        System.out.println("set method replaces the element in the specified position with the new element .");
		list.set(1,17);
		System.out.println(list);
		//System.out.println(list.remove(1));
		System.out.println(list);
		for (int ii = 0; ii < list.size(); ii++) {
			System.out.print(list.get(ii)+" ");
		}
		System.out.println();
		for(Integer val :list)
			System.out.print(val+" ");
	}

}
