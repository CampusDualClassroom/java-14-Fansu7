package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	public String getSquad(){
		return this.squad;
	}

	@Override
	public void getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append("\nAgente: ");
		builder.append(getName());
		builder.append(" ");
		builder.append(getSurname());
		builder.append(".\nDivisión: ");
		builder.append(this.getSquad());
		builder.append(".");
		System.out.println(builder.toString());
	}
}
