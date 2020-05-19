package BackTracking;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
/* 연산자 끼워넣기 
 *	􏰣􏳍􏰣􏰒􏰾􏰽􏲢􏲚􏰊􏰜􏰧􏱑􏳐􏲬􏲭􏲮􏱏􏰠􏰡􏰢􏰣􏰤􏰋􏰣􏴌􏲟􏲠􏰘􏰄􏲷􏰙􏲠􏰄􏱄􏰙N개의 수와 N-1개의 연산자가주어질때 연산자를 하나씩 넣어 수식을 만들때, 
 * 만들수 있는 식의 결과가 최대인 것과 최소인 것 구하는 문제 􏰣􏳍􏰣􏰒􏰾􏰽􏲢􏲚􏰊􏰜􏰧􏱑􏳐􏲬􏲭􏲮􏱏􏰠􏰡􏰢􏰣􏰤􏰋􏰣􏴌􏲟􏲠􏰘
 */
class Pair{
	public int min, max;
	Pair(int min, int max)
	{
		this.min = min;
		this.max = max;
	}
}
public class B_14888 {

	static int n;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 n = Integer.parseInt(bf.readLine());
		int [] num = new int[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());

		for(int i =0 ; i<n; i++)
		{
			num[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(bf.readLine());
		int plus = Integer.parseInt(st.nextToken());
		int minus = Integer.parseInt(st.nextToken());
		int mul = Integer.parseInt(st.nextToken());
		int div = Integer.parseInt(st.nextToken());
		Pair ans = go(num, 1,num[0], plus, minus, mul,div);
		
		bw.write( ans.max+"\n"+ans.min+"\n");
		bw.close();

	}
	static Pair go(int [] num, int index, int cal, int plus, int minus, int mul, int div)
	{
	
		if(index == n) return new Pair(cal,cal);
		ArrayList <Pair> res = new ArrayList<>();
		
		if(plus>0) {
			res.add(go(num, index+1, cal+num[index], plus-1, minus, mul, div));
		}
		if(minus>0)
		{
			res.add(go(num , index+1, cal-num[index], plus, minus-1, mul , div));
		}
		if(mul>0)
		{
			res.add(go(num , index+1, cal*num[index], plus, minus, mul-1 , div));
		}
		if(div>0)
		{
			res.add(go(num , index+1, cal/num[index], plus, minus, mul , div-1));
		}
		Pair ans = res.get(0);
		for(Pair p : res)
		{
			if(ans.max<p.max) ans.max = p.max;
			if(ans.min>p.min) ans.min = p.min;
		}
		return ans;
		
	}
	

}
