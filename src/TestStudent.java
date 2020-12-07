import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class TestStudent {

	private static String name;

	public static void main(String[] args) {
		studentDemo[] sarr=new studentDemo[2];
		Scanner sc=new Scanner(System.in);
		
		StudentService.acceptdata(sarr);
		
		
		int choice=0;
		do {
		System.out.println("1.Search by roll");
		System.out.println("2.Search by name");
		System.out.println("3.Sort by name");
		System.out.println("4.Calculate cgpa of students");
		System.out.println("5.Display Detailed");
		System.out.println("6.Exit");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Roll no. for search");
			int num=sc.nextInt();
			int pos=StudentService.searchByRoll(sarr,num);
			if(pos==-1) {
				System.out.println("not found");
			}
			else {
				System.out.println("found and postition:"+pos);
				System.out.println(sarr[pos]);
			}
			break;
		case 2:
			StudentService.searchByName(sarr);
			
			break;
		case 3:
			StudentService.studentsort(sarr);
			break;
		case 4:
			
			StudentService.calculatecgpa(sarr);
			break;
		case 5:
			StudentService.displayData(sarr);
			break;
		}
		}
		while(choice!=5);
		
		}
	}

  
