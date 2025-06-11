package DAY4;
	import java.io.FileWriter;
	import java.io.IOException;
	public class Task3 {
		public static void main(String args[]){
			String filename="";
			try{
				FileWriter myWriter=new FileWriter("D:\\workspace-java\\Demo.txt");
				myWriter.write("Welcome");
				myWriter.close();
				System.out.println("Successfully");
			}catch(Exception e){
				System.out.println("An error occured");
				e.printStackTrace();
			}
		}

	}


