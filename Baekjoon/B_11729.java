import java.io.*;
import java.util.StringTokenizer;

public class B_11729 {

	static int n , cnt =0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		 n = Integer.parseInt(bf.readLine());
		 hanoi(n,1,2,3);
		 System.out.println(cnt);
		 System.out.println(sb);
		 

	}
	static void hanoi(int n , int from, int by, int to )
	{
		cnt++;
		if(n==1)
		{
			sb.append(from+" "+to+"\n");
			return;
		}
		else
		{
			hanoi(n-1,from,to,by);
			sb.append(from+" "+to+"\n");
			hanoi(n-1,by,from,to);
		}
	}

}
