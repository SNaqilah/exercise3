package exercise3;

public class SumAverageRuningInt {

	public static void main(String[] args) {
		System.out.println("For Loop");
		int sumf=0;
		double averagef;
		int lowerboundf=1;
		int upperboundf=100;
		
		for(int numberf=lowerboundf; numberf<=upperboundf; numberf++) {
			sumf=sumf+numberf;
		}
		averagef= sumf/100.00;
		
		System.out.println("The sum of 1 to 100 is" + sumf);
		System.out.println("The average is" + averagef);
		System.out.println(" ");
		
		System.out.println("While Loop");
        int sumw=0;
        double averagew;
        int lowerboundw=1;
        int upperboundw=100;

        int numberw=lowerboundw;
while (numberw<=upperboundw) {
	sumw = sumw + numberw;
	numberw++;
}
averagew= sumw/100.00;

System.out.println("The sum of 1 to 100 is" + sumw);
System.out.println("The average is" + averagew);
System.out.println(" ");

System.out.println("Do While Loop");
int sumdw=0;
double averagedw;
int lowerbounddw=1;
int upperbounddw=100;

int numberdw=lowerbounddw;
do{
	sumdw = sumdw 	+ numberdw;
	numberdw++;
}while(numberdw<=upperbounddw);
averagedw= sumw/100.00;




System.out.println("The sum of 1 to 100 is" + sumdw);
System.out.println("The average is" + averagedw);
System.out.println(" ");



	}

}
