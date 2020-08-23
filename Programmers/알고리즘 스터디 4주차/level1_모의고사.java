import java.util.ArrayList;

public class level1_모의고사 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answers[] = {1,2,3,4,5}; 
		int answer [] = solution(answers);
		for(int i = 0 ; i<answer.length ; i++) {
			System.out.println(answer[i]);
		}
		
	}
	public static int[] solution(int[] answers) {
		
		int answer[] = {};
		int cnt[] = {0,0,0};
		int[] man1 = {1,2,3,4,5};
		int [] man2 = {2,1,2,3,2,4,2,5};
		int [] man3 = {3,3,1,1,2,2,4,4,5,5};
		
		
		for(int i = 0 ; i<answers.length ; i++) {
			if(answers[i] == man1[(i%5)]) {
				cnt[0]++;
			} 
			if(answers[i] == man2[(i%8)]) {
				cnt[1]++;
			}
			if(answers[i] == man3[(i%10)]) {
				cnt[2]++;
			} 
		}
	
		int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
		ArrayList <Integer> list = new ArrayList<>();
		if(max == cnt[0]) {
			list.add(1);
		}
		if(max == cnt[1]) {
			list.add(2);
		}
		if(max == cnt[2]) {
			list.add(3);
		}
		answer = new int[list.size()];
		for(int i = 0 ; i<answer.length ; i++) {
			answer[i] = list.get(i);
		}
		return answer;
		
		
		
	}


}
