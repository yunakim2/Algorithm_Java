import java.io.*;
import java.util.StringTokenizer;

public class B_10039 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n[] = new int[5];
		int sum=0; 
		for(int i = 0 ; i<5 ; i++)
		{
			n[i] = Integer.parseInt(bf.readLine());
			if(n[i]<40)
			{
				n[i] = 40;
			}
			sum = sum+n[i];
		}
		
		bw.write(sum/5+"\n");
	
		bw.close();

	}

}
