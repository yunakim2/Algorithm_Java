import java.io.*;
import java.util.StringTokenizer;

public class B_1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		int res = 0;
		if(n<100)
		{
			bw.write(n+"\n");
		}
		else
		{
			res = 99;
			for(int i = 100 ; i<=n ; i++)
			{
				res+= check(i);
			}
			if(n==1000) res--;
			bw.write(res+"\n");
		}	
		
		
		
		bw.close();

	}
	static int check(int n)
	{
		int n1 = n/100%10;
		int n2 = n/10%10;
		int n3 = n%10;
		if(n2*2 == n1+n3) return 1;
		
		return 0;
	}

}
