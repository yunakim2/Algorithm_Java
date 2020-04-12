import java.io.*;
import java.util.StringTokenizer;

public class B_3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n[] = new int[10];
		int count[] = new int [42];
		int num=0;
		for(int i = 0 ; i<10 ; i++)
		{
			n[i] = Integer.parseInt(bf.readLine())%42;
			count[n[i]]++;
			
		}
		
		for(int i = 0 ; i<count.length ; i++)
		{
			if(count[i]!=0) {
				num++;
			}
		}
			
		bw.write(num+"\n");
		bw.close();

	}

}
