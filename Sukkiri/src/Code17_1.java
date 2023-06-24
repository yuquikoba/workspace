import java.io.FileWriter;
import java.io.IOException;

public class Code17_1 {

	public static void main(String[] args) {
		/*
	}
		FileWriter fw=null;
		try {
		fw=new FileWriter("data.txt");
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		try(FileWriter fw=new FileWriter("data");){
			fw.write("hello");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
