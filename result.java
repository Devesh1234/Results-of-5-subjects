import java.util.Scanner;

class result
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int s1=0;
		int s2=0;
		int s3=0;
		int s4=0;
		int s5=0;

		int total_max_marks=0;

		int total_marks=0;

		float percentage=0;
		float average_marks=0;


		System.out.println("Enter the marks of first subject");
		s1=sc.nextInt();


		System.out.println("Enter the marks of second subject");
		s2=sc.nextInt();

		System.out.println("Enter the marks of third subject");
		s3=sc.nextInt();

		System.out.println("Enter the marks of fourth subject");
		s4=sc.nextInt();

		System.out.println("Enter the marks of fifth subject");
		s5=sc.nextInt();


		System.out.println("Enter the total maximum marks of all subjects");
		total_max_marks=sc.nextInt();



		total_marks=s1+s2+s3+s4+s5;


		average_marks=(float)total_marks/5;

		percentage=((float)total_marks/(float)total_max_marks)*100;


		


		System.out.println("The total marks of all 5 subjects are : "+total_marks);

		System.out.println("The average marks for all 5 subjects is : "+average_marks);

		System.out.println("The percentage of a student is : "+percentage);


			






	}
}