
public class Average {
public static void main (String [] args){
	int a=119;
	int b=112;
	int c=36;
	int d=GetAverage(a,b,c);
	System.out.println("The Average is"+d);
	
	int e=109;
	int f=8;
	int g=66;
	int h=GetAverage(e,f,g);
	System.out.println("The average is "+h);
}
public static int GetAverage(int num1,int num2, int num3){
	int Average=(num1+num2+num3 )/3;
	return Average;
}

}
