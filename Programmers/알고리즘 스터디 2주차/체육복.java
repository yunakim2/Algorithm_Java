
public class level1_gymclothes {
	

	public static void main(String[] args) {
			
			int n = 5 ; 
			int lost [] = {2,4};
			int reserve [] = {1,3,5};
			
			
			System.out.println(solution(n, lost, reserve));
			
	
		}
		public static int solution(int n,int [] lost , int [] reserve) {
			int answer = 0; 
			
			int clothes[] = new int[n+1];
			for(int l : lost) {
				clothes[l] --;
			}
			for(int r: reserve) {
				clothes[r]++;
			}
			
			
			for(int i = 1 ; i<=n ; i++) {
			
				if(clothes[i]==-1) {
					if(i+1<=n && clothes[i+1]==1) {
						clothes[i+1]--;
						clothes[i]++;
					}
					else if(i-1 >=1 && clothes[i-1]==1) {
						clothes[i-1]--;
						clothes[i]++;
					}
				}
			}
			for(int i = 1; i<=n; i++) {
				//System.out.println("i : "+i +"   clothes: "+clothes[i]);
				if(clothes[i] >=0) {
					answer++;
				}
			}
			
			return answer;
		}
		

}
