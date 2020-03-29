package user.entities;

public class User {
	
	private Integer userID;
	
	private String username;
	
	private Integer age;
	
	private String email;
	
	public User(Integer userID,String username, Integer age, String email) {
		this.userID=userID;
		this.username=username;
		this.age=age;
		this.email=email;
	}
	
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public Integer getAmount() {
		return age;
	}

	public void setAmount(Integer age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
