import java.io.*;
import java.util.StringTokenizer;

public class B_2447 {

	public static char [][] star;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(bf.readLine());
		star = new char[n][n];
		for(int i =0 ; i<n; i++)
		{
			for(int j =0; j<n ; j++)
			{
				star[i][j] =' ';
			}
		}
		StarArr(0,0,n);
		for(int i =0 ; i<n; i++)
		{
			for(int j =0; j<n; j++)
			{
				bw.write(star[i][j]);
			}
			bw.write("\n");
		}
		
		bw.close();

	}
	static void StarArr(int x, int y, int n)
	{
		if(n==1)
		{
			star[x][y] = '*';
			return;
		}
		int val = n/3;
		for(int i =0 ; i<3 ;i++)
		{
			for(int j= 0; j<3; j++)
			{
				if(i==1&&j==1) ;
				else StarArr(x+(val*i), y+(val*j), val);
			}
		}
	}
	

}
