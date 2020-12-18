package vo;

public class User {
	private String id;
    private String userName;
    private String password;
    private double money;
    private boolean locker;
	public User(String id, String userName, String password, double money, boolean locker) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.money = money;
		this.locker = locker;
	}
	public User() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public boolean getLocker() {
		return locker;
	}
	public void setLocker(boolean locker) {
		this.locker = locker;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ",userName=" + userName + ", password=" + password + ", ye=" + money + ", status=" + locker + "]";
	}
	
 


    	 
}
