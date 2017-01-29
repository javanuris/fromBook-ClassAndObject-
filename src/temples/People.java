package temples;

public abstract class People {
	private String secondName;
	private String firstName;
	private String lastName;
	private int number;
	private int adress;
	
	public People(String secondName , String firstName, String lastName , int number , int adress){
		this.secondName = secondName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.adress = adress;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setAdress(int adress) {
		this.adress = adress;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSecondName() {
		return secondName;
	}
	public int getNumber() {
		return number;
	}
	public int getAdress() {
		return adress;
	}
	

}
