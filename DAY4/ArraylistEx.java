package DAY4;

import java.util.ArrayList;

public class ArraylistEx {
	public static void main(String args[]){
		ArrayList<Integer>arr=new ArrayList();
		ArrayList<Object>arr2=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.forEach(num->System.out.println(num*num));
		arr.forEach(age->{
			if(age>=18){
				System.out.println("eligible");
			}
			else{
				System.out.println("Not eligible");
			}
		});
		arr2.add("hello");
		System.out.println(arr);
		System.out.println(arr2);
	}

}
