import java.io.*;
public class skillchecktest1 {

	public static void main(String[] args) {
		
		System.out.println(solution("pPoooyY"));

	}
	public static boolean solution(String s) {
		boolean answer = true;
		int p = 0;
		int y = 0 ;
		int n = s.length();
		for(int i = 0 ; i<n; i++) {
			if(s.charAt(i) == 'p' || s.charAt(i)=='P') {
				p++;
			}
			if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
				y++;
			}
		}
		
		if(p!=y) {
			answer = false;
		}
		return answer;
	}

}
