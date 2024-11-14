package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	public String getSpecialization(){
		return this.specialization;
	}

	@Override
	public void getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append("\nDoctor: ");
		builder.append(getName());
		builder.append(" ");
		builder.append(getSurname());
		builder.append(".\nEspecialista en ");
		builder.append(this.getSpecialization().toLowerCase());
		builder.append(".");
		System.out.println(builder.toString());
	}
}
