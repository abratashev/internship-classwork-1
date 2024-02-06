package core.this_and_super;

import java.time.LocalDateTime;

public class Person {

	private String fio;

	private LocalDateTime birthDate;

	public String getFio() {
		return this.fio;
	}

	public LocalDateTime getBirthDate() {
		return this.birthDate;
	}

	public Person(String fio, LocalDateTime birthDate) {
		this.fio = fio;
		this.birthDate = birthDate;
	}

}
