import java.io.*;


public class B_9498 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n>=60)
		{
			if(n>=70)
			{
				if(n>=80)
				{
					if(n>=90)  bw.write("A");
					else bw.write("B");
				}
				else
				{
					bw.write("C");
				}
				
			}
			else bw.write("D");
			
		}
		
		else bw.write("F");
		bw.close();

	}

}

