import java.io.*;
import java.util.StringTokenizer;

public class B_1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		double num [] = new double [n];
		double max = 0;
		double sum =0;
		for(int i = 0 ; i<n ; i++)
		{
			num[i]=Integer.parseInt(st.nextToken());
			if(max<=num[i])
			{
				max = num[i];
			}
		}
		for(int i = 0 ; i<n ; i++)
		{
			num[i] = num[i]/max*100;
			sum = sum+num[i];
		}
		

			
		bw.write((sum/n)+"\n");
		bw.close();

	}

}

