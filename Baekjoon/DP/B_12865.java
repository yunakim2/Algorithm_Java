import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_12865 {

	public static void main(String[] args)throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int value = 0 ;
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int W[] = new int[N+1];
		int V[] = new int[N+1];
		
		//DP 배열 = DP[i번째 아이템][무게]
		int dp[][] = new int[N+1][K+1];
		for(int i = 1 ; i<=N ; i++) {
			st = new StringTokenizer(bf.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1  ; i <=N ; i++) {
			for(int j = 1 ; j<=K ; j++) {
				dp[i][j] = dp[i-1][j];
				if(j-W[i]>=0) { // 무게에서 자신의 무게 뺐을때 남는 무게 존재
					dp[i][j] =Math.max(dp[i-1][j],dp[i-1][j-W[i]]+V[i]);
					//이전 아이템에서 구한 가치와 남은 무게 가치 + 자신의 가치 중 큰 값 넣기
				}
			}
		}
		
		bw.write(dp[N][K]+"");
		bw.close();
	}

}
