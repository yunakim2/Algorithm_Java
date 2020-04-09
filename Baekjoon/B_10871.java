import java.io.*;
import java.util.StringTokenizer;

public class B_10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		for(int i = 0 ; i<n1 ; i++)
		{
			int k = Integer.parseInt(st2.nextToken());
			if(k<n2)
			{
				bw.write(k+" ");
			}
			
			
		}
		bw.flush();
		bw.close();

	}

}