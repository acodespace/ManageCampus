
public class CampusPerson {
	// Create class Campusperson attributes
	private String idNum;
	private String lastName;
	private String firstName;
	private String email;

// A Default constructor
	public CampusPerson() {

	}

// A constructor with parameters.
	/**
	 * @param idNum
	 * @param lastName
	 * @param firstName
	 * @param email
	 */
	public CampusPerson(String idNum, String lastName, String firstName, String email) {
		this.idNum = idNum;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	// Create a toString() method
	@Override
	public String toString() {
		return String.format("[idNum=%s, lastName=%s, firstName=%s, email=%s]", idNum, lastName, firstName, email);
	}

	// Create getters and setters.
	/**
	 * @return the idNum
	 */
	public String getIdNum() {
		return idNum;
	}

	/**
	 * @param idNum the idNum to set
	 */
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
