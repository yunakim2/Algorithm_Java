import java.io.*;
import java.util.StringTokenizer;

public class B_10996 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i =0 ; i<2*n; i++)
		{
			if(i%2 ==0)
			{
				for(int j = 0 ; j<n ; j++)
				{
					if(j%2==0) bw.write("*");
					
					else bw.write(" ");
				}
			}
			else
			{
				for(int j = 0 ; j<n ; j++)
				{
					if(j%2==0) bw.write(" ");
					
					else bw.write("*");
				}
			}
			bw.write("\n");
		}
				
		bw.close();

	}

}
