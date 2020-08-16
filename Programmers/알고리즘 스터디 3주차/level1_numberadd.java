
public class level1_numberadd {

	public static void main(String[] args) {
		int answer = solution(123);
		System.out.println("answer : "+ answer);

	}
	public static int solution(int n) {
		int answer = 0 ;
		while(n!=0) {
			answer +=n%10;
			n /= 10;
		}
		return answer;
	}

}
