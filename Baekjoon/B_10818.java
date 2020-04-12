import java.io.*;
import java.util.StringTokenizer;

public class B_10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		int min =1000000;
		int max =-1000000;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num [] = new int [n];
		for(int i = 0; i<n; i++)
		{
			
			num[i]= Integer.parseInt(st.nextToken());
			if(min>=num[i]) min = num[i];
			if(max<=num[i]) max =num[i];
		}
		
		bw.write(min+" "+max+"\n");
		
		bw.close();

	}

}
