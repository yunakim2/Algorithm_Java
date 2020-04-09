import java.io.*;
import java.util.StringTokenizer;

public class B_2739 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1 ; i< 10 ; i++)
		{
			bw.write(n+" * "+i+" = "+n*i+"\n");
		}
		bw.close();

	}

}
