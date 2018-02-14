
public class TwoNumbers {
	public static void main (String [] args){
		int a=119;
		int b=112;
		int c =Compare(a,b);
		System.out.println("The smalles number is " +c);
		
		int f=189;
		int g=212;
		int h= Compare(f,g);
		System.out.println("The smallest number is "+h);
		
		
		
		
	}
	public static int Compare(int num1,int num2){
		if (num1> num2){
			return num2;

		}else {
			return num1;
		}
	}
}
