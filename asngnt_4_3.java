import java.util.Scanner;
public class asngnt_4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
       System.out.println("Enter in the employee details");
       System.out.print("Name\t");
       e1.setName(sc.next());
       System.out.print("Id\t");
       e1.setId(sc.next());
       System.out.print("Designation\t");
       e1.setDesignation(sc.next());
       System.out.print("Blood Group\t");
       e1.setBloodgroup(sc.next());
       System.out.print("Salary\t");
       e1.setSalary(sc.nextInt());
       System.out.print("Age\t");
       e1.setAge(sc.nextShort());
       
       System.out.println("\n The details of the employee are\n");
       System.out.println("Name\t" + e1.getName());
       System.out.println("Id\t" + e1.getId());
       System.out.println("Designation\t" + e1.getDesignation());
       System.out.println("BloodGroup	" + e1.getBloodGroup());
       System.out.println("Salary	" + e1.getSalary());
       System.out.println("Age	" + e1.getAge());
		
	}

}