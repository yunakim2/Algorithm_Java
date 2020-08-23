import java.util.Arrays;
import java.util.Comparator;

public class level2_가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {6,10,2};
		System.out.println(solution(numbers));
	}
	public static String solution(int[] numbers) {
		String answer = "";
	
		String [] arr = new String[numbers.length];
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
		
		});
		if(arr[0].equals("0")) {
			return "0";
		}
		for(int i = 0 ; i<arr.length ; i++) {
			answer+=arr[i];
		}
		
		return answer;
	}
}
