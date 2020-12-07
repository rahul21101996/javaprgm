import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class StudentService {
	

	public static void acceptdata(studentDemo[] sarr) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println("Enter roll");
			int rll=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			
			String nm=sc.nextLine();
			System.out.println("Enter address");
			String addr=sc.nextLine();
			System.out.println("enter m1");
			float m1=sc.nextFloat();
			System.out.println("enter m2");
			float m2=sc.nextFloat();
			System.out.println("enter m3");
			float m3=sc.nextFloat();
			System.out.println("Enter date in dd/mm/yy format");
			String dt=sc.next();
			try {
				Date dt1=sdf.parse(dt);
				sarr[i]=new studentDemo(rll,nm,dt1,addr,m1,m2,m3);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
	}
	public static int searchByRoll(studentDemo[] sarr,int num) {
		for(int i=0;i<sarr.length;i++) {
			if(sarr[i].getroll()==num) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void displayData(studentDemo [] sarr) {
		for(int i=0;i<sarr.length;i++) {
			System.out.println(sarr[i]);
	}

	}
	public static void searchByName(studentDemo[] sarr) {
		Scanner sc=new Scanner(System.in);
	
		 int flag=0;
		System.out.println("Enter the name for searching");
		
		String nm=sc.next();
		for(int i=0;i<sarr.length;i++)
		{
			
		if(sarr[i].getname(nm).equals(nm))
		{
			System.out.println("Student name found:");
			flag=1;
			break;
		}

		
			
		
		}
		if(flag==0) {
		System.out.println("student name not found");
		}
	}
	public static void calculatecgpa(studentDemo[] sarr) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("calculate the cgpa");
		
		//String nm=sc.next();
		float cgpa=0;
		int flag=0;
		System.out.println("enter roll no for claculate cgpa");
		int n=sc.nextInt();
		for(int i=0;i<sarr.length;i++)
		{
		if(sarr[i].getroll()==n){
		cgpa=((sarr[i].getm1()*1/3)+(sarr[i].getm2()*1/2)+(sarr[i].getm3()*1/4));
		flag=1;
		break;
		}
		}
		System.out.println("cgpa:"+cgpa);
		if(flag==0) {
			System.out.println("roll no not found");
		}
		
	}
	public static void studentsort(studentDemo[] sarr) {
		
	}
	
}
