import java.io.*;
import java.util.StringTokenizer;

public class B_10870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int sum=0;
		int n = Integer.parseInt(bf.readLine());
		for(int i = 0 ; i<=n ; i++)
		{
			sum = fibo(i);
		}
	
		
		bw.write(sum+"\n");
		bw.close();

	}
	static int fibo(int n)
	{
		if(n>=2)
		{	
			return fibo(n-1)+fibo(n-2);
		}
		else
		{
			return n;
		}
	}

}
