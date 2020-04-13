import java.io.*;
import java.util.StringTokenizer;

public class B_4673 {	
	static int N = 10001;
	public static void main(String[] args) throws IOException {
	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		boolean[] not = new boolean[N];
		for(int i = 1; i<N; i++)
		{
			cnt = d(i);
			if(cnt<N) {
				not[cnt] = true;
			}
		}
		for(int i = 1; i<not.length ; i++)
		{
			if(!not[i]) bw.write(i+"\n");
		}
		
		bw.close();

	}
	static int d(int n)
	{
		int sum =n;
		while(true)
		{
			if(n==0) break;
			sum = sum+ n%10;
			n = n/10;
		}
		
		return sum;
	}

}
