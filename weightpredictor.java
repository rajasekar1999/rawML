import java.util.*;
 
class ML{
	private static Scanner in;
	public static void main(String args[]){
		in = new Scanner (System.in);
		int t = in.nextInt();
		float h[] = new float[t];
		float w[] = new float[t];
		float htot=0,wtot=0;
		float rat;
		for(int i=0; i<t; i++){
			h[i] = in.nextFloat();
			htot+=h[i];
		}
		for(int i=0; i<t; i++){
			w[i] = in.nextFloat();
			wtot+=w[i];
		}
		rat = htot/wtot;
		float iph,opw;
		int t1 = in.nextInt();
		for(int j=0; j<t1; j++){
			iph = in.nextInt();
			opw = iph/rat;
			System.out.println(opw);
			htot+=iph;
			wtot+=opw;
			rat=htot/wtot;
		}
	}
}
