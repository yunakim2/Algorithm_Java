import java.io.*;
import java.util.StringTokenizer;

public class B_5543 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n[] = new int[5];
	
		int min1=2000;
		int min2=2000;
		for(int i = 0 ; i<5 ; i++)
		{
			n[i] = Integer.parseInt(bf.readLine());
			if(i<3)
			{
				if(min1>n[i])
				{
					min1= n[i];
				}
			}
			else
			{
				if(min2>n[i])
				{
					min2 = n[i];
				}
			}
		}
		
		bw.write((min1+min2-50)+"\n");
	
		bw.close();

	}

}
