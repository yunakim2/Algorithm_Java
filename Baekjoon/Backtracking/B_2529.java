package BackTracking;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/* 부등호 
 *부등호기호가 나열된 수열이 있을 때 기호의 앞과 뒤에 숫ㄹ자를 넣어서 모든 부등호의 관계를 
 만족 시키려고 한다. 이때 넣은 숫자는 모두 달라야함!
 	k개의 부등호 관계를 모두 만족시키는 k+1개 자리 정수 중에서 최대값과 최소값을 구하는 문제 
 */
public class B_2529 {

	static int n;
	static ArrayList<String> ans = new ArrayList<>();
	static boolean [] check = new boolean[10];
	static char[] a = new char[20];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());

		 for(int i = 0 ; i<n; i++)
		 {
			a[i] = st.nextToken().charAt(0);
		 }
		go(0,"");
		 Collections.sort(ans);
		 int m = ans.size();
		 bw.write(ans.get(m-1)+"\n");
		 bw.write(ans.get(0)+"\n");
		
		bw.close();

	}
	static boolean good(char x, char y, char op)
	{
		if(op =='<')
		{
			if(x>y) return false;
		}
		if(op == '>')
		{
			if(x<y) return false;
		}
		return true;
	}
	static void go(int index, String num)
	{
		if(index == n+1)
		{
			ans.add(num);
			return;
		}
		for(int i =0 ; i<=9; i++)
		{
			if(check[i]) continue;
			if(index ==0 || good(num.charAt(index-1),(char)(i+'0'),a[index-1]))
			{
				check[i] = true;
				go(index +1, num+Integer.toString(i));
				check[i] = false;
			}
		}
		
	}
	

}
