package core.this_and_super;

import java.time.LocalDateTime;

public class Employee extends Person {

	private String department;

	private String phone;

	public Employee(String fio, LocalDateTime birthDate, String department, String phone) {
		super(fio, birthDate);
		this.department = department;
		this.phone = phone;
	}

	public String getDepartment() {
		return this.department;
	}

	public String getPhone() {
		return this.phone;
	}


}
