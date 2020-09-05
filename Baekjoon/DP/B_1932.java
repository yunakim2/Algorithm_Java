import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_1932 {
	static int dp[][];
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		dp = new int[num][num];
		for(int i =0 ; i<num ; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j = 0 ; j<= i ; j++) 
			{
				dp[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int sum = 0 ;
		for(int i = 1; i<num ; i++) {
			for(int j = 0 ; j<=i ; j++) {
				if(j == 0) {
					dp[i][j] += dp[i-1][j];
					//System.out.println("dp"+i+j+"::::::"+dp[i][j]);
				} else if(j == i) {
					
					dp[i][j]+=dp[i-1][j-1];
					//System.out.println("dp"+i+j+"::::::"+dp[i][j]);
				} else {
					dp[i][j] = Math.max(dp[i][j]+dp[i-1][j-1], dp[i][j]+dp[i-1][j]);
					//System.out.println("dp"+i+j+"::::::"+dp[i][j]);
				}
				if(dp[i][j]>sum) {
					sum = dp[i][j];
				}
			}
		}
		bw.write(sum+"");
		
	
	
		bw.close();
		
	
	}
	
}
