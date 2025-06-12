package Day6;

public class Pro extends Thread{
     public void run(){
    	 for(int i=1;i<=10;i++){
    		 System.out.println("welcome"+" "+i);	 
    	 }
     }
     }
class Execute{
	public static void main(String[] args) {
		Pro m=new Pro();
		m.start();
	}

}
