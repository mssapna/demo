package week10_java_sapna;

public class Pattern2 {
public static void main(String[] args) {
	int number =5;
	for(int value1=1;value1<=number;value1++)
	{
		for(int value2=1;value2<=number;value2++ )
		{
			if(value1==1||value1==number||value2==1||value2==number-1)
			{
			System.out.print("* ");
			}
		}
		System.out.println(" ");
	}
	}
}
