
public class sample2 {

	public static void main(String[] args) {
		String S1="(),[],{}";
		String S2="(),[],{}";
		System.out.println(S1.equals(S2));
		System.out.println(S1==S2);
		String S3=new String ("()");
		String S4=new String ("()");
		
		
		System.out.println(S3.equals(S4));
		System.out.println(S3==S4);
		String S5=new String ("()").intern();
		String S6=new String ("()").intern();
		System.out.println(S5.equals(S6));
		System.out.println(S5==S6);
		
		
		
		// TODO Auto-generated method stub

	}

}
