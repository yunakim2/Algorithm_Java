import java.io.*;
import java.util.StringTokenizer;

public class B_2577 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n1 = Integer.parseInt(bf.readLine());
		int n2 = Integer.parseInt(bf.readLine());
		int n3 = Integer.parseInt(bf.readLine());
		
		int n = n1*n2*n3;
		int num[ ] = new int[10];
		while(n!=0)
		{
			num[n%10] +=1;
			n/=10;
		}
		for(int i = 0 ; i<10 ; i++) bw.write(num[i]+"\n");
		
		bw.close();

	}

}
