import java.io.*;
import java.util.StringTokenizer;

public class B_2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = 0;
		int n = Integer.parseInt(bf.readLine());
		for(int i =0 ; i<n ; i++)
		{
			c =0;
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int k = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			for(int p = 0 ; p<s.length() ; p++)
			{
				for(int j = k ; j>0 ; j--)
				{
					bw.write(s.charAt(p));	
				}
			}
			
			bw.write("\n");
		}
		
		
		bw.close();

	}
}

