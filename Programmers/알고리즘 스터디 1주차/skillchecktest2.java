import java.util.Arrays;

public class skillchecktest2 {

	public static void main(String[] args) {
		
		String [] participant = {"leo","kiki","eden"};
		String[] completion= {"eden","kiki"};
		
		String s = solution(participant, completion);
		System.out.println(s);

	}
	
	 public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	       
	        Arrays.sort(participant);
	        Arrays.parallelSort(completion);
	        int i ; 
	        for(i = 0 ; i< completion.length; i++) {
	        	if(!participant[i].equals(completion[i])) {
	        		answer = participant[i];
	        		return answer;
	        	}
	        }
	        answer= participant[i];
	        return answer;
	    }

}
