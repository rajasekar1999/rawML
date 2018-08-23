import java.util.*;
 
class ML{
	private static Scanner in;
	public static void main(String args[]){
		in = new Scanner (System.in);
		System.out.println("Enter the number of test cases for training: ");
		int t = in.nextInt();
		float h[] = new float[t];
		float w[] = new float[t];
		float htot=0,wtot=0;
		float rat;
		System.out.println("Enter the heights in an array: ");
		for(int i=0; i<t; i++){
			h[i] = in.nextFloat();
			htot+=h[i];
		}
		System.out.println("Enter the weights in an array: ");
		for(int i=0; i<t; i++){
			w[i] = in.nextFloat();
			wtot+=w[i];
		}
		rat = htot/wtot;
		float iph,opw;
		System.out.println("Enter the number of test cases for prediction: ")
		int t1 = in.nextInt();
		for(int j=0; j<t1; j++){
			System.out.println("Enter the height: ");
			iph = in.nextInt();
			opw = iph/rat;
			System.out.println("The predicted weight: " + opw);
			htot+=iph;
			wtot+=opw;
			rat=htot/wtot;
			System.out.println("The modified ratio: " + rat);
		}
	}
}
