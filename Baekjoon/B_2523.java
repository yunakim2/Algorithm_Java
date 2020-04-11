import java.io.*;
import java.util.StringTokenizer;

public class B_2523 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		for(int i = 1 ; i<=n ; i++)
		{
			for(int j = 0 ; j<i ; j++)
			{
				bw.write("*");
			}
			bw.write("\n");
		}
		for(int i =n-1 ; i>0 ; i--)
		{
			for(int j = 0; j<i ; j++)
			{
				bw.write("*");
			}
			bw.write("\n");
		}
	
		bw.close();

	}

}
