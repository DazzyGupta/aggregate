package orderdetails.entities;

public class Order {
	
	private Integer id;
	
	private Integer userId;
	
	private Float amount;
	
	private String date;
	
	public Order() {}
	
	public Order(Integer id, Integer userId, Float amount, String date) {
		this.id=id;
		this.userId=userId;
		this.amount=amount;
		this.date=date;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
