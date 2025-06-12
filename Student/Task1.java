package Student;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
public class Task1 {
	
public static void main(String args[]){
	ArrayList<Object>arr=new ArrayList();
	arr.add("Neha");
	arr.add("A");
	arr.add("Computer Science"); 
	arr.add("Final Year");
	arr.add("0,Swetha");  
	arr.get(2);
	arr.set(4, "kgcas");
	arr.remove(2);
	arr.add(4,"computer");
	for(Object data:arr){
		System.out.println(data);
	}
}
}
