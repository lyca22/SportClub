package model;

public class AssistantCoach extends Coach{
	
	private boolean professionalPlayer;
	private Specialty specialty;
	
	/**
	* Constructor method for the AssistantCoach class. <br>
	* Pre: <br>
	* Post: Creates an instance of AssistantCoach. <br>
	*/
	public AssistantCoach(String name, int identifier, int salary, int experienceYears, boolean professionalPlayer, Specialty specialty){
		
		super(name, identifier, salary, experienceYears);
		this.professionalPlayer = professionalPlayer;
		this.specialty = specialty;
		
	}
	
	/**
	* Returns the attribute professionalPlayer. <br>
	* Pre: AssistantCoach has been initialized. <br>
	* Post: Returns the attribute professionalPlayer. <br>
	* @return professionalPlayer
	*/
	public String getProfessionalPlayer(){
		String msg;
		if(professionalPlayer){
			msg = "Yes";
		}else{
			msg = "No";
		}
		return msg;
	}
	
	/**
	* Changes the attribute professionalPlayer. <br>
	* Pre: AssistantCoach has been initialized. <br>
	* Post: Changes the attribute professionalPlayer. <br>
	*/
	public void setProfessionalPlayer(boolean professionalPlayer){
		this.professionalPlayer = professionalPlayer;
	}
	
	/**
	* Returns the attribute specialty. <br>
	* Pre: AssistantCoach has been initialized. <br>
	* Post: Returns the attribute specialty. <br>
	* @return specialty
	*/
	public Specialty getSpecialty(){
		return specialty;
	}
	
	/**
	* Changes the attribute specialty. <br>
	* Pre: AssistantCoach has been initialized. <br>
	* Post: Changes the attribute specialty. <br>
	*/
	public void setSpecialty(Specialty specialty){
		this.specialty = specialty;
	}
	
	/**
	* Changes the attribute specialty based on the parameter specialty. <br>
	* Pre: AssistantCoach has been initialized. <br>
	* Post: Changes the attribute specialty based on the parameter specialty, which is an integer. <br>
	*/
	public void changeSpecialty(int specialty){
		switch(specialty){
			case 1:
			this.specialty = Specialty.Offensive;
			break;
			case 2:
			this.specialty = Specialty.Defensive;
			break;
			case 3:
			this.specialty = Specialty.Possession;
			break;
			case 4:
			this.specialty = Specialty.Laboratory_plays;
			break;
		}
	}
	
	/**
	* Returns the assistant coach's information. <br>
	* Pre: AssistantCoach has been initialized. <br>
	* Post: Returns the assistant coach's information. <br>
	* @return msg The assistant coach's information. It returns a String.
	*/
	@Override
	public String getInfo(){
		String msg = super.getInfo();
		msg += "Was he a professional player?: " + getProfessionalPlayer() + "\n";
		msg += "Expertise: " + specialty + "\n";
		return msg;
	}
	
}