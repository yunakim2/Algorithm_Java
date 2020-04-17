import java.io.*;
import java.util.StringTokenizer;

public class B_10872 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int re =1;
		int n = Integer.parseInt(bf.readLine());
		for(int i = 1 ; i<=n ; i++)
		{
			re = re*i;
		}
	
		
		bw.write(re+"\n");
		bw.close();

	}

}
