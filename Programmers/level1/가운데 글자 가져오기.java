
public class level1_middlestring {

	public static void main(String[] args) {
			
			String s= "abcde";
			
			
			System.out.println(solution(s));
			
	
		}
		public static String solution(String s) {
			String answer ="";
			
			if(s.length() %2 == 0 ) {
				int n = s.length()-1;
				answer = ""+s.charAt(n/2) + s.charAt(n/2+1);
			}
			else {
				int n = s.length();
				answer = ""+s.charAt(n/2);
			}
			
			return answer ; 
		}
}
