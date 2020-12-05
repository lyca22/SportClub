package model;

public class Employee{
	
	private String name;
	private int identifier;
	private int salary;
	private boolean status;
	
	/**
	* Constructor method for the Employee class. <br>
	* Pre: <br>
	* Post: Creates an instance of Employee. <br>
	*/
	public Employee(String name, int identifier, int salary){
		
		this.name = name;
		this.identifier = identifier;
		this.salary = salary;
		status = true;
		
	}
	
	/**
	* Returns the attribute name. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Returns the attribute name. <br>
	* @return name
	*/
	public String getName(){
		return name;
	}
	
	/**
	* Changes the attribute name. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Changes the attribute name. <br>
	*/
	public void setName(String name){
		this.name = name;
	}
	
	/**
	* Returns the attribute identifier. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Returns the attribute identifier. <br>
	* @return identifier
	*/
	public int getIdentifier(){
		return identifier;
	}
	
	/**
	* Changes the attribute identifier. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Changes the attribute identifier. <br>
	*/
	public void setIdentifier(int identifier){
		this.identifier = identifier;
	}
	
	/**
	* Returns the attribute salary. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Returns the attribute salary. <br>
	* @return salary
	*/
	public int getSalary(){
		return salary;
	}
	
	/**
	* Changes the attribute salary. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Changes the attribute salary. <br>
	*/
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	/**
	* Returns the attribute status. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Returns the attribute status. <br>
	* @return status
	*/
	public String getStatus(){
		String msg;
		if(status){
			msg = "Active";
		}else{
			msg = "Inactive";
		}
		return msg;
	}
	
	/**
	* Changes the attribute status. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Changes the attribute status. <br>
	*/
	public void setStatus(boolean status){
		this.status = status;
	}
	
	/**
	* Returns the employee's information. <br>
	* Pre: Employee has been initialized. <br>
	* Post: Returns the employee's information. <br>
	* @return msg The employee's information. It returns a String.
	*/
	public String getInfo(){
		String msg = "\nName: " + name;
		msg += "\nIdentifier: " + identifier;
		msg += "\nSalary: " + salary;
		msg += "\nStatus: " + getStatus() + "\n";
		return msg;
	}
	
}