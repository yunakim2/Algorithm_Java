package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

/* 에너지 모으기 
 * N개의 에너지 구슬을 이용하여 에너지 모으는 방법 i번째 에너지 구슬 무게 : W[i]
 */

public class B_16198 {
	static int n;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
		n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> a = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i =0 ; i<n ; i++)
		{
			a.add(Integer.parseInt(st.nextToken())); 
		}
		
		bw.write(go(a)+"\n");
		
		bw.close();

	}
	static int go(ArrayList<Integer> a)
	{
		int n = a.size();
		if(n == 2) return 0;
	
		int ans =0;
		for(int i =1; i<n-1; i++)
		{
			int energe = a.get(i-1)* a.get(i+1);
			ArrayList<Integer> b= new ArrayList<>(a);
			b.remove(i);
			energe += go(b);
			if(ans <energe)
			{
				ans = energe;
			}
		}
		return ans;
	}


}
