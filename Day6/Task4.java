package Day6;

public class Task4 extends Thread{
     public void run(){
    	 for(int i=1;i<=10;i++){
    		 System.out.println("welcome"+" "+i);	 
    	 }
     }
     }
class Execute{
	public static void main(String[] args) {
		Task4 m=new Task4();
		m.start();
	}

}
