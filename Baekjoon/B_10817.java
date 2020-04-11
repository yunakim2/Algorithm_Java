import java.io.*;
import java.util.StringTokenizer;

public class B_10817 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
	
		int n[] = new int[3];
		int temp;
		for(int i = 0 ; i<3; i++)
		{
			n[i] = Integer.parseInt(st.nextToken()); 
			
		}
		
		for(int i = 0 ;i<3 ; i++)
		{
			for(int j = 0 ;j<3 ; j++)
			{
				if(n[i]>n[j])
				{
					temp = n[i];
					n[i] = n[j];
					n[j] =temp;
				}
			}
		}
		
		bw.write(n[1]+"\n");
		
	
		bw.close();

	}

}
