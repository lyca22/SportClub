package model;

public class Coach extends Employee{
	
	private int experienceYears;
	
	/**
	* Constructor method for the Coach class. <br>
	* Pre: <br>
	* Post: Creates an instance of Coach. <br>
	*/
	public Coach(String name, int identifier, int salary, int experienceYears){
		
		super(name, identifier, salary);
		this.experienceYears = experienceYears;
		
	}
	
	/**
	* Returns the attribute experienceYears. <br>
	* Pre: Coach has been initialized. <br>
	* Post: Returns the attribute experienceYears. <br>
	* @return experienceYears
	*/
	public int getExperienceYears(){
		return experienceYears;
	}
	
	/**
	* Changes the attribute experienceYears. <br>
	* Pre: Coach has been initialized. <br>
	* Post: Changes the attribute experienceYears. <br>
	*/
	public void setExperienceYears(int experienceYears){
		this.experienceYears = experienceYears;
	}
	
	/**
	* Returns the coach's information. <br>
	* Pre: Coach has been initialized. <br>
	* Post: Returns the coach's information. <br>
	* @return msg The coach's information. It returns a String.
	*/
	@Override
	public String getInfo(){
		String msg = super.getInfo();
		msg += "Years of experience: " + experienceYears + "\n";
		return msg;
	}
	
}