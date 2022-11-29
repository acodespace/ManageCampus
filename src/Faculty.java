
public class Faculty extends CampusPerson {

	private String salary;

// A default constructor
	public Faculty() {
		super();
	}

	@Override
	public String toString() {
		return String.format("Faculty: %s Faculty [salary=%s]", super.toString(), salary);
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
