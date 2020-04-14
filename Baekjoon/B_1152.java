import java.io.*;
import java.util.StringTokenizer;

public class B_1152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		s = s.trim();
		if(s.isEmpty())
		{
			bw.write(0+"\n");
		}
		else
		{
			bw.write(s.split(" ").length+"\n");
		}
		
		bw.close();

	}
}

