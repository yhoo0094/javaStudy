public class VariableExample3 {
public static void main(String[] args){
		byte b1 = -128; //-128 = 10000000(2);
		byte b2 = 127; //127 = 01111111(2);
		
		/*
		System.out.println(b2++); //b2=b2+1;
		System.out.println(b2++); //b2=b2+1;
		System.out.println(b2++); //b2=b2+1;
		
		System.out.println(--b1); //b1=b1-1;
		System.out.println(--b1); //b1=b1-1;
		System.out.println(--b1); //b1=b1-1;
		*/
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(b2++);
		}
	}
}