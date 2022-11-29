
public class Student extends CampusPerson {
	private String gpa;

	public Student() {
		// super();
	}

	@Override
	public String toString() {
		return String.format("Student: %s Student [gpa=%s]", super.toString(), gpa);
	}

	// Create getter and setter.
	/**
	 * @return the gpa
	 */
	public String getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
}
