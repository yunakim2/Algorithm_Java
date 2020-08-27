
public class level2_n진수게임 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(2,4,2,1));
	}
	public static String solution(int n , int t, int m , int p) {
		String answer = "";
		String nums[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		int cnt = 1; // 숫자 개수
		int i =1; // 진법 변환할 숫자
	
		String value ="0";
		while(cnt <t*m) {
			String temp= "";
			int num = i;
			while(num!=0) {
				temp = nums[num%n] + temp;
				num/=n;
			}
			
			cnt += temp.length();
			value+= temp;
			i++;
		}
		
		
		int j =0;
		while(j<t*m) {
			if(j%m==p-1) {
				answer+=value.charAt(j);
			}
			j++;
		}
		return answer;
	}

}
