package maasHesaplayici;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee("kemal", 2000, 45, 1985);

		employee.toString(employee.tax(), employee.bonus(), employee.raiseSalary());

	}

}
