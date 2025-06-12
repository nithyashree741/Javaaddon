package Day6;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
	public static void main(String args[]){
		HashMap<String,Integer> studentmarks=new HashMap();
		studentmarks.put("Swetha",30);
		studentmarks.put("Neha", 20);
		studentmarks.put("Anusha", 40);
		int total=0;
		for(int marks:studentmarks.values()){
			total+=marks;
		}
			System.out.println(total);
	        double avg=total/studentmarks.size();
	        System.out.println(avg);
	        for(Map.Entry<String, Integer>entry:studentmarks.entrySet()){
	        	System.out.println(entry.getKey()+""+entry.getValue());
	        }
	}

}
