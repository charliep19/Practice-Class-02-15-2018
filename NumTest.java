
public class NumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =36;
		int b= 101;
		int c= 205;
		double d= compareNumbers (a,b,c);
		System.out.println(d);
		
		int g= 400;
		int r= 3;
		int k= 119;
		double h = compareNumbers(g,r,k);
		System.out.println(h);
	}
 public static double  compareNumbers( int num1, int num2, int num3) {
	 double sum= ( num1+ num2+ num3) /3;
	 return sum;
 }
}
