package HomeWork1;

public class Exercise1 {
	public static void main (String[] args) {
		int a= 23;
		short b = 2;
		long c = 4563;
		double d = 233.673;
		float e = 34.56f;
		char f = 'x';
		boolean g = true;
		int result1 = a + b;
		double result2 = c + d;
		double result3 = d + e;
		System.out.println(a+" "+ b +" "+ c +" "+ d +" "+ e +" "+ f +" "+ g +" "+ result1 +" "+ result2+" "+ result3);
		if ( c > d)
		{
		System.out.println("c more d");	
		}
		else
		{
		System.out.println("c less d");	
		}
		if (e < a)
		{
		System.out.println("e less a");	
		}
		else
		{
		System.out.println("e more a");	
		}
		if (result1 == result2)
		{
		System.out.println("It's Great!!!!");	
		}
		else
		{
		System.out.println("And yet they are different(");	
		}
	}

}
