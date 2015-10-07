public class Employee {
	String empCode = "";
	String empName = "";
	String empAddr = "";
	String empDOB = "";

	void calcMonthlyGrossSal() {
	}

	void calcMonthlyTax() {
	}

	void calcMonthlyNetSal() {
	}

	public static void main(String args[]) {
		SalariedEmp[] salEmp = new SalariedEmp[3];
		for (int i = 0; i < 3; i++) {
			salEmp[i] = new SalariedEmp();
		}

		salEmp[0].empCode = "E001";
		salEmp[0].empName = "Bobin";
		salEmp[0].empAddr = "E-2 Lajpat Nager";
		salEmp[0].empDOB = "01/Feb/1974";
		salEmp[0].annualBasicSal = 800000;

		salEmp[1].empCode = "E002";
		salEmp[1].empName = "Kevin";
		salEmp[1].empAddr = "E-15 Mandir Marg";
		salEmp[1].empDOB = "01/Apr/1980";
		salEmp[1].annualBasicSal = 1000000;

		salEmp[2].empCode = "E003";
		salEmp[2].empName = "Mohan";
		salEmp[2].empAddr = "E-15 Mandir Marg";
		salEmp[2].empDOB = "31/Jul/1984";
		salEmp[2].annualBasicSal = 400000;

		salEmp[0].printSalEmpDetailFormat();
		for (int i = 0; i < 3; i++) {
			salEmp[i].printSalEmpDetail();

		}
		System.out
				.println("---------------------------------------------------------------------------------");

		ContractedEmp[] contEmp = new ContractedEmp[3];
		for (int i = 0; i < 3; i++) {
			contEmp[i] = new ContractedEmp();
		}

		contEmp[0].empCode = "C001";
		contEmp[0].empName = "Mohan";
		contEmp[0].empAddr = "E-4 Lajpat Nager";
		contEmp[0].empDOB = "30/Jun/1974";
		contEmp[0].ratePerWorkingDay = 5000;

		contEmp[1].empCode = "C002";
		contEmp[1].empName = "Steve";
		contEmp[1].empAddr = "E-15 Mandir Marg";
		contEmp[1].empDOB = "15/Oct/1981";
		contEmp[1].ratePerWorkingDay = 7000;

		contEmp[2].empCode = "C003";
		contEmp[2].empName = "Mary ";
		contEmp[2].empAddr = "E-15 Mandir Marg";
		contEmp[2].empDOB = "15/Dec/1979";
		contEmp[2].ratePerWorkingDay = 10000;

		contEmp[0].printConEmpDetailFormat();
		for (int i = 0; i < 3; i++) {
			contEmp[i].printConEmpDetail();

		}
		System.out
				.println("---------------------------------------------------------------------------------");

	}
}

class SalariedEmp extends Employee {
	float annualBasicSal = 0;
	int noOfDaysInMonth = 0;
	int noOfLeaves = 0;
	float netPayableSal = 0;

	void printSalEmpDetailFormat() {
		System.out
				.println("________________________________________________________________________________");
		System.out
				.println("|Employee Code  |Name    |Address           |Date of Birth |Annual Basic Salary |");
		System.out
				.println("|---------------|--------|------------------|--------------|--------------------|");
	}

	void printSalEmpDetail() {
		System.out.println("|" + empCode + "           |" + empName + "   |"
				+ empAddr + "  |" + empDOB + "   |" + annualBasicSal
				+ "            |");
	}
}

class ContractedEmp extends Employee {
	float ratePerWorkingDay = 0;
	int noOfDaysPresent = 0;
	float netPayableSal = 0;

	void printConEmpDetailFormat() {
		System.out
				.println("________________________________________________________________________________");
		System.out
				.println("|Employee Code  |Name    |Address           |Date of Birth |Annual Basic Salary |");
		System.out
				.println("|---------------|--------|------------------|--------------|--------------------|");
	}

	void printConEmpDetail() {
		System.out.println("|" + empCode + "           |" + empName + "   |"
				+ empAddr + "  |" + empDOB + "   |" + ratePerWorkingDay
				+ "            |");
	}
}
