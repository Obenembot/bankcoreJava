package person;

public abstract class Person {

	private String name;
	private String surname;
	private long phoneNumber; // phone_number
	private String emial; //email_address
	private String address; // house_address
    // ADD id_number;
    private int id_number;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", phoneNumber=" + phoneNumber + ", emial=" + emial
				+ ", address=" + address + "]";
	}

}
