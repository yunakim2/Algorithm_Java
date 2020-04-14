import java.io.*;
import java.util.StringTokenizer;

public class B_11654 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum =0;
		int n = Integer.parseInt(bf.readLine());
		String st = bf.readLine();
		for(int i =0 ;i<n; i++)
		{
			int k = Integer.parseInt(""+st.charAt(i));
			sum= sum+k;
		}
		bw.write(sum+"\n");
		bw.close();

	}
}
