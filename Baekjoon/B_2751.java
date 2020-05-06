import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2751 {
	static int num[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		
		num = new int [n];
		for(int i = 0 ; i<n; i++)
		{
			num[i] = Integer.parseInt(bf.readLine());
		}

		Arrays.sort(num);
		for(int i = 0 ; i<n; i++)
		{
			bw.write(num[i]+"\n");
		}
		
		bw.close();
	}



}