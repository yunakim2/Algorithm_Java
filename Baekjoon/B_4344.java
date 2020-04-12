import java.io.*;
import java.util.StringTokenizer;

public class B_4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		
		double sum;
		for(int i = 0 ; i<n ; i++)
		{	StringTokenizer st = new StringTokenizer(bf.readLine());
			int num = Integer.parseInt(st.nextToken());
			int p [] = new int [num];
			int c = 0;
			sum =0;
			for(int j = 0 ; j<num ; j++)
			{
				p[j] = Integer.parseInt(st.nextToken());
				sum = sum+p[j];
				
			}
			double avg = sum/num;
			for(int j = 0; j<num ; j++)
			{
				if(avg< p[j]) c++;
			}
			bw.write(String.format("%.3f",((double)c/(double)num*100))+"%\n");
			
			
		}
		

			
		
		bw.close();

	}

}


