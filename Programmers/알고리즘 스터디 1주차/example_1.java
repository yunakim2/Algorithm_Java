
public class example_1 {

	public static void main(String[] args) {
		String seoul [] = {"Jane","Kim"};
		System.out.println(solution(seoul));

	}
	public static String solution(String[] seoul) {
		String answer = "";
		int i ;
		for( i = 0 ; i<seoul.length;i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 "+i+"에 있다";
				break; 
			}
		}
		
		return answer ;
	}

}
