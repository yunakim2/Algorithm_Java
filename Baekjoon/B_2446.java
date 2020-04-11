import java.io.*;
import java.util.StringTokenizer;

public class B_2446 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i< (2*n-1)/2 ; i++)
		{
			for(int j = 0; j<i ; j++)
			{
					bw.write(" ");
			}
			for(int j = (2*n-1)-2*i; j>0 ; j--)
			{
					bw.write("*");
			}
			bw.write("\n");
		}
			
		for(int i = (2*n-1)/2; i>=0 ;i--)
		{
			for(int j=i ; j>0 ;j--)
			{
				bw.write(" ");
			}
			for(int j = (2*n-1)-2*i; j>0 ; j--)
			{
					bw.write("*");
			}
			bw.write("\n");
			
		}
		
		bw.close();

	}

}
