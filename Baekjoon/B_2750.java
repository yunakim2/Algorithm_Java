
import java.io.*;
import java.util.StringTokenizer;

public class B_2750 {

	static int sort[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		sort = new int [n];
		for(int i = 0 ; i<n; i++)
		{
			sort[i] = Integer.parseInt(bf.readLine());
		}
		sorting();
		
		for(int i = 0 ; i<n; i++)
		{
			bw.write(sort[i]+"\n");
		}
		
		bw.close();

	}
	static void sorting()
	{
		int temp;
		for(int i =0 ; i<sort.length; i++)
		{
			for(int j = i ;j<sort.length ; j++)
			{
				if(sort[i]>=sort[j])
				{
					temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
			
		}
		
	}

}
