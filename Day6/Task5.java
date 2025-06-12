package Day6;

public class Task5 extends Thread {
	private String Name;
	Task5(String name){
		this.Name=Name;
	}
	public void run(){
		for(int i=1;i<=4;i++){
			System.out.println(Name);
			try{
				Thread.sleep(400);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
	class Main{
		public static void main(String args[]){	
	Task5 m=new Task5("HILL");
	Task5 m1=new Task5("HELLO");
	m.start();
	m1.start();
	}
	}

