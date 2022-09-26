import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your monthly salary");
		int monthlySalary=sc.nextInt();
		int annualBasicSalary=monthlySalary*12;
	    int hra=(20/100)*annualBasicSalary;
	    int da=(40/100)*annualBasicSalary;
		int ta = 0;
		int annualSalary=annualBasicSalary+hra+da+ta;
		//int basicSalary=monthlySalary-da;
		
		System.out.println("Annual salary:"+annualSalary);
		int tax=0;
		if(annualSalary>500000)
		{
			 ta=(monthlySalary*10)/100;
		}
			if(annualSalary<=500000)
			{
				System.out.print("NO TAX");
			}
			else if((annualSalary>=500000) &&(annualSalary<=1000000))
			{
				 tax=(annualSalary*10)/100;
				 System.out.println("Tax amount:"+tax);
			}
			else if((annualSalary>1000000) &&(annualSalary<2000000))
			{
				 tax=(annualSalary*20)/100;
				 System.out.println("Tax amount:"+tax);
			}
			else {
				tax=(annualSalary*30)/100;
				System.out.println("Tax amount:"+tax);
			}
			
			int taxableSalary=annualSalary-tax;
			System.out.println();
			System.out.println("Taxable salary:"+taxableSalary);
			

	}

}
