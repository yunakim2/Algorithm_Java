package BackTracking;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
/* 스타트와 링크 
 *	N명을 N/2씩 두팀으로 나누는데 두팀의 능력치를 구한다음 차이의 최소값 구하는 문제
 */
public class B_14889 {

	static int [][]S;
	static int n;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 n = Integer.parseInt(bf.readLine());
		 S = new int[n][n];
		for(int i =0 ; i<n ; i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j = 0; j<n; j++)
			{
				S[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		ArrayList<Integer> first =new ArrayList<>();
		ArrayList<Integer> second =new ArrayList<>();
		
		
		bw.write(go(0, first, second)+"\n");
		bw.close();

	}
	static int go(int index, ArrayList<Integer> first, ArrayList<Integer> second)
	{
		if(index == n)
		{
			if(first.size()!=n/2) return -1;
			if(second.size()!=n/2) return -1;
			int t1 = 0;
			int t2 = 0;
			for(int i = 0 ; i<n/2; i++)
			{
				for(int j =0 ;j<n/2 ; j++)
				{
					if(i==j) continue;
					t1+=S[first.get(i)][first.get(j)];
					t2+=S[second.get(i)][second.get(j)];
				}
				
			}
			int diff = Math.abs(t1-t2);
			return diff;
		}
		int ans = -1;
		first.add(index);
		int t1 = go(index+1, first,second);
		if(ans == -1 || (t1!=-1 && ans>t1))
		{
			ans = t1;
		}
		first.remove(first.size()-1);
		second.add(index);
		int t2 = go(index+1, first,second);
		if(ans == -1 || (t2!=-1 && ans>t2))
		{
			ans = t2;
		}
		second.remove(second.size()-1);
		return ans;
		
	}
	

}
