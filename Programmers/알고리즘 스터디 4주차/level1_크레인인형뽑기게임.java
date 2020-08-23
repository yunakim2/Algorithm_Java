import java.util.Stack;

public class level1_크레인인형뽑기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[] = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board,moves));
		

	}
	public static int solution(int[][] board , int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();	
		
		for(int i = 0 ; i<moves.length ; i++) {
			int num = moves[i]-1;
			for(int j = 0 ; j<board.length; j++) {
				if(board[j][num]!=0) {
					if(stack.isEmpty()) {
						stack.push(board[j][num]);
					} else {
						if(stack.peek() == board[j][num]) {
							stack.pop();
							answer += 2;
						} else {
							stack.push(board[j][num]);
						}
					}
					board[j][num] = 0;
					break;
				}
			}
		}
		
		
		return answer ; 
	}
	

}
