import java.io.*;
import java.util.StringTokenizer;

public class B_15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i<n ; i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			bw.write(n1+n2+"\n");
			
			
		}
		bw.flush();
		bw.close();

	}

}