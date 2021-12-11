package models;

/**
 * 
 *
 */
public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private String secQues;

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param password
	 * @param secQues
	 */
	public User(int id, String name, String email, String password,
			String secQues) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.secQues = secQues;
	}

	/**
	 * @param name
	 * @param email
	 * @param password
	 * @param secQues
	 */
	public User(String name, String email, String password, String secQues) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.secQues = secQues;
	}

	/*
	 * Getter Setter for member variables
	 */
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the secQues
	 */
	public String getSecQues() {
		return secQues;
	}

	/**
	 * @param secQues
	 *            the secQues to set
	 */
	public void setSecQues(String secQues) {
		this.secQues = secQues;
	}
}
