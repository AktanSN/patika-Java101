package maasHesaplayici;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		double vergi = 0;
		if (this.salary > 1000) {
			vergi = this.salary * 0.03;
		}

		return vergi;
	}

	double bonus() {
		double bonus = 0;
		if (this.workHours > 40) {
			bonus = (workHours - 40) * 30;
		}

		return bonus;
	}

	double raiseSalary() {
		double raise = 0;

		if (this.hireYear > 19) {
			raise = this.salary * 0.15;
		} else if (this.hireYear > 9 && this.hireYear < 20) {
			raise = this.salary * 0.10;
		} else {
			raise = this.salary * 0.05;
		}

		return raise;
	}

	void toString(double tax, double bonus, double raiseSalary) {
		System.out.println("Ad� : " + this.name);
		System.out.println("Maa�� : " + this.salary);
		System.out.println("�al��ma Saati : " + this.workHours);
		System.out.println("Ba�lang�� Y�l� : " + this.hireYear);
		System.out.println("Vergi : " + tax);
		System.out.println("Bonus : " + bonus);
		System.out.println("Maa� Art��� : " + raiseSalary);
		System.out.println("Vergi ve Bonuslar ile birlikte maa� : " + ((this.salary + bonus) - tax));
		System.out.println("Toplam Maa� : " + (this.salary + raiseSalary));
	}
}
