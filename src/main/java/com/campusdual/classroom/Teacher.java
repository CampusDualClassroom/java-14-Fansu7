package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public String getArea(){
		return this.area;
	}

	public void getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append("\nNombre completo: ");
		builder.append(getName());
		builder.append(" ");
		builder.append(getSurname());
		builder.append(".\nArea de trabajo: ");
		builder.append(this.getArea());
		builder.append(".");
		System.out.println(builder.toString());
	}
}
