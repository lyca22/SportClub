package ui;
import model.*;
import java.util.Scanner;

public class Menu{
	
	private final static int UPDATE_CLUB_INFORMATION = 0;
	private final static int HIRE_EMPLOYEE = 1;
	private final static int DISMISS_EMPLOYEE = 2;
	private final static int ADD_PLAYER_TO_TEAM = 3;
	private final static int ADD_COACH_TO_TEAM = 4;
	private final static int UPDATE_EMPLOYEE_INFORMATION = 5;
	private final static int UPDATE_TEAM_NAME = 6;
	private final static int CREATE_LINEUP = 7;
	private final static int ADD_TO_DRESSINGROOM = 8;
	private final static int ADD_TO_OFFICES = 9;
	private final static int SHOW_CLUB_INFORMATION = 10;
	private final static int SHOW_TEAMS_INFORMATION = 11;
	private final static int SHOW_LINEUPS = 12;
	private final static int SHOW_EMPLOYEES_INFORMATION = 13;
	private final static int SHOW_DRESSING_ROOM = 14;
	private final static int SHOW_OFFICES = 15;
	private final static int EXIT = 16;
	
	private SportClub sportClub;
	private Scanner sc = new Scanner(System.in);
	
	/**
	* Constructor method for the Menu class. <br>
	* Pre: <br>
	* Post: Creates an instance of Menu with the given values. <br>
	*/
	public Menu(){
		
		System.out.println("Enter club's name:");
		String name = sc.nextLine();
		System.out.println("Enter the club's NIT:");
		int NIT = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the foundation day:");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the foundation month:");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the foundation year:");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the team A:");
		String teamNameA = sc.nextLine();
		System.out.println("Enter the name of the team B:");
		String teamNameB = sc.nextLine();
		
		sportClub = new SportClub(name, NIT, day, month, year, teamNameA, teamNameB);
		
	}
	
	/**
	* Starts and runs the program. <br>
	* Pre: <br>
	* Post: Runs the program using showMenu() and doOperation() <br>
	*/
	public void startProgram(){
		
		int option;
		do{
			
			showMenu();
			option = readOption();
			doOperation(option);
			
		}while(option != EXIT);
		
	}
	
	/**
	* Shows the menu to the user. <br>
	* Pre: <br>
	* Post: Shows all the available functions to the user. <br>
	*/
	public void showMenu(){
		
		String msg = "0. Update club's information.\n";
		msg += "1. Hire an employee.\n";
		msg += "2. Dismiss an employee.\n";
		msg += "3. Add a player to a team.\n";
		msg += "4. Add a coach to a team.\n";
		msg += "5. Update an employee's information.\n";
		msg += "6. Update a team's name.\n";
		msg += "7. Create a new lineup.\n";
		msg += "8. Add a player to a dressing room.\n";
		msg += "9. Add a coach to the office.\n";
		msg += "10. Show the club's information.\n";
		msg += "11. Show a team's information.\n";
		msg += "12. Show team lineups.\n";
		msg += "13. Show the employees' information.\n";
		msg += "14. Show the dressing room.\n";
		msg += "15. Show the offices.\n";
		msg += "16. Close the application.\n";
		System.out.println(msg);
		
	}
	
	/**
	* Reads the input of the user to select an option. <br>
	* Pre: <br>
	* Post: Reads the input of the user to select an option. <br>
	*/
	public int readOption(){
		
		int option;
		
		System.out.println("Enter a value according to what you want to do.");
		option = sc.nextInt();
		sc.nextLine();
		
		return option;
		
	}
	
	/**
	* Does an operation based on the user's inputs. <br>
	* Pre: <br>
	* Post: Does an operation based on the user's inputs. <br>
	*/
	public void doOperation(int choice){
		
		int option = 0;
		int NIT;
		String name = "";
		int identifier;
		int salary;
		int goals;
		double rating;
		Positions position = Positions.Forward;
		int experienceYears;
		int teamAmount;
		int wonChampionships;
		boolean professionalPlayer = true;
		Specialty specialty = Specialty.Offensive;
		String text = "";
		Employee employee;
		Player player;
		HeadCoach headCoach;
		AssistantCoach assistantCoach;
		int number;
		int opt;
		int day;
		int month;
		int year;
		Tactics tactic = Tactics.Default;
		
		switch(choice){
			case UPDATE_CLUB_INFORMATION:
			System.out.println("1. Update name:");
			System.out.println("2. Update NIT:");
			System.out.println("3. Update date:");
			option = readOption();
			switch(option){
				case 1:
				System.out.println("Enter the new club's name:");
				name = sc.nextLine();
				sportClub.setName(name);
				break;
				case 2:
				System.out.println("Enter the new club's NIT:");
				NIT = sc.nextInt();
				sc.nextLine();
				sportClub.setNIT(NIT);
				break;
				case 3:
				System.out.println("Enter the new club's foundation date:");
				System.out.println("Day:");
				day = sc.nextInt();
				sc.nextLine();
				System.out.println("Month:");
				month = sc.nextInt();
				sc.nextLine();
				System.out.println("Year:");
				year = sc.nextInt();
				sc.nextLine();
				sportClub.getFoundationDate().changeDate(day, month, year);
				break;
			}
			break;
			case HIRE_EMPLOYEE:
			System.out.println("1. Hire player:");
			System.out.println("2. Hire head coach:");
			System.out.println("3. Hire assistant coach:");
			option = readOption();
			System.out.println("Enter the employee's name:");
			name = sc.nextLine();
			System.out.println("Enter the employee's identifier:");
			identifier = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the employee's salary:");
			salary = sc.nextInt();
			sc.nextLine();
			switch(option){
				case 1:
				System.out.println("Enter the employee's goals:");
				goals = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the employee's rating:");
				rating = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the employee's position (1. Goalkeeper / 2. Defender / 3. Midfielder / 4. Forward):");
				option = sc.nextInt();
				sc.nextLine();
				switch (option){
					case 1:
					position = Positions.Goalkeeper;
					break;
					case 2:
					position = Positions.Defender;
					break;
					case 3:
					position = Positions.Midfielder;
					break;
					case 4:
					position = Positions.Forward;
					break;
				}
				System.out.println(sportClub.addEmployee(name, identifier, salary, goals, rating, position));
				System.out.println("Press enter to continue.");
				sc.nextLine();
				break;
				case 2:
				System.out.println("Enter the employee's experience years:");
				experienceYears = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the amount of teams he has been in charge of:");
				teamAmount = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the amount of championships he has won:");
				wonChampionships = sc.nextInt();
				sc.nextLine();
				System.out.println(sportClub.addEmployee(name, identifier, salary, experienceYears, teamAmount, wonChampionships));
				System.out.println("Press enter to continue.");
				sc.nextLine();
				break;
				case 3:
				System.out.println("Enter the employee's experience years:");
				experienceYears = sc.nextInt();
				sc.nextLine();
				System.out.println("Professional player? (1. Yes / 2. No):");
				option = sc.nextInt();
				sc.nextLine();
				switch(option){
					case 1:
					professionalPlayer = true;
					break;
					case 2:
					professionalPlayer = false;
					break;
				}
				System.out.println("Enter the employee's expertise: (1. Offensive / 2. Defensive / 3. Possession / 4. Laboratory plays)");
				option = sc.nextInt();
				sc.nextLine();
				switch (option){
					case 1:
					specialty = Specialty.Offensive;
					break;
					case 2:
					specialty = Specialty.Defensive;
					break;
					case 3:
					specialty = Specialty.Possession;
					break;
					case 4:
					specialty = Specialty.Laboratory_plays;
					break;
				}
				System.out.println(sportClub.addEmployee(name, identifier, salary, experienceYears, professionalPlayer, specialty));
				System.out.println("Press enter to continue.");
				sc.nextLine();
				break;
			}
			break;
			case DISMISS_EMPLOYEE:
			System.out.println("Enter the employee's identifier:");
			identifier = sc.nextInt();
			sc.nextLine();
			System.out.println(sportClub.removeEmployee(identifier));
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case ADD_PLAYER_TO_TEAM:
			System.out.println("Enter the player's identifier:");
			identifier = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the player's number:");
			number = sc.nextInt();
			sc.nextLine();
			System.out.println("1. Team A / 2. Team B:");
			option = sc.nextInt();
			sc.nextLine();
			switch(option){
				case 1:
				System.out.println(sportClub.getTeamA().addPlayer(sportClub.searchEmployee(identifier), number));
				break;
				case 2:
				System.out.println(sportClub.getTeamB().addPlayer(sportClub.searchEmployee(identifier), number));
				break;
			}
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case ADD_COACH_TO_TEAM:
			System.out.println("Enter the coach's identifier:");
			identifier = sc.nextInt();
			sc.nextLine();
			System.out.println("1. Team A / 2. Team B:");
			option = sc.nextInt();
			sc.nextLine();
			switch(option){
				case 1:
				System.out.println(sportClub.getTeamA().addCoach(sportClub.searchEmployee(identifier)));
				break;
				case 2:
				System.out.println(sportClub.getTeamB().addCoach(sportClub.searchEmployee(identifier)));
				break;
			}
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case UPDATE_EMPLOYEE_INFORMATION:
			System.out.println("Enter the employee's identifier:");
			identifier = sc.nextInt();
			sc.nextLine();
			do{
				if(sportClub.searchEmployee(identifier) instanceof Player && sportClub.searchEmployee(identifier) != null){
					player = (Player)sportClub.searchEmployee(identifier);
					text = "0. Go back.\n";
					text += "1. Update name.\n";
					text += "2. Update identifier.\n";
					text += "3. Update salary.\n";
					text += "4. Update goals.\n";
					text += "5. Update rating.\n";
					text += "6. Update position.\n";
					text += "7. Update number.\n";
					System.out.println(text);
					option = readOption();
					switch(option){
						case 1:
						System.out.println("Enter the player's new name:");
						name = sc.nextLine();
						player.setName(name);
						break;
						case 2:
						System.out.println("Enter the player's new identifier:");
						identifier = sc.nextInt();
						sc.nextLine();
						player.setIdentifier(identifier);
						break;
						case 3:
						System.out.println("Enter the player's new salary:");
						salary = sc.nextInt();
						sc.nextLine();
						player.setSalary(salary);
						break;
						case 4:
						System.out.println("Enter the player's new amount of goals:");
						goals = sc.nextInt();
						sc.nextLine();
						player.setGoals(goals);
						break;
						case 5:
						System.out.println("Enter the player's new rating:");
						rating = sc.nextDouble();
						sc.nextLine();
						player.setAverageRating(rating);
						break;
						case 6:
						System.out.println("Enter the player's new position (1. Goalkeeper / 2. Defender / 3. Midfielder / 4. Forward):");
						opt = sc.nextInt();
						sc.nextLine();
						player.changePosition(opt);
						break;
						case 7:
						System.out.println("Enter the player's new number:");
						number = sc.nextInt();
						sc.nextLine();
						player.setNumber(number);
						break;
					}
				}else if(sportClub.searchEmployee(identifier) instanceof HeadCoach && sportClub.searchEmployee(identifier) != null){
					headCoach = (HeadCoach)sportClub.searchEmployee(identifier);
					text = "0. Go back.\n";
					text += "1. Update name.\n";
					text += "2. Update identifier.\n";
					text += "3. Update salary.\n";
					text += "4. Update years of experience.\n";
					text += "5. Update number of teams he has been charge of.\n";
					text += "6. Update won championships.\n";
					System.out.println(text);
					option = readOption();
					switch(option){
						case 1:
						System.out.println("Enter the headcoach's new name:");
						name = sc.nextLine();
						headCoach.setName(name);
						break;
						case 2:
						System.out.println("Enter the headcoach's new identifier:");
						identifier = sc.nextInt();
						sc.nextLine();
						headCoach.setIdentifier(identifier);
						break;
						case 3:
						System.out.println("Enter the headcoach's new salary:");
						salary = sc.nextInt();
						sc.nextLine();
						headCoach.setSalary(salary);
						break;
						case 4:
						System.out.println("Enter the headcoach's new years of experience:");
						experienceYears = sc.nextInt();
						sc.nextLine();
						headCoach.setExperienceYears(experienceYears);
						break;
						case 5:
						System.out.println("Enter the headcoach's new number of teams:");
						teamAmount = sc.nextInt();
						sc.nextLine();
						headCoach.setTeamAmount(teamAmount);
						break;
						case 6:
						System.out.println("Enter the headcoach's new amount of won championships:");
						wonChampionships = sc.nextInt();
						sc.nextLine();
						headCoach.setWonChampionships(wonChampionships);
						break;
					}
				}else if(sportClub.searchEmployee(identifier) instanceof AssistantCoach && sportClub.searchEmployee(identifier) != null){
					assistantCoach = (AssistantCoach)sportClub.searchEmployee(identifier);
					text = "0. Go back.\n";
					text += "1. Update name.\n";
					text += "2. Update identifier.\n";
					text += "3. Update salary.\n";
					text += "4. Update professional player status.\n";
					text += "5. Update expertise.\n";
					System.out.println(text);
					option = readOption();
					switch(option){
						case 1:
						System.out.println("Enter the assistant coach's new name:");
						name = sc.nextLine();
						assistantCoach.setName(name);
						break;
						case 2:
						System.out.println("Enter the assistant coach's new identifier:");
						identifier = sc.nextInt();
						sc.nextLine();
						assistantCoach.setIdentifier(identifier);
						break;
						case 3:
						System.out.println("Enter the assistant coach's new salary:");
						salary = sc.nextInt();
						sc.nextLine();
						assistantCoach.setSalary(salary);
						break;
						case 4:
						System.out.println("Enter the assistant coach's new professional player status: (1. He was/ 2. He wasn't)");
						opt = sc.nextInt();
						sc.nextLine();
						if(opt == 1){
							assistantCoach.setProfessionalPlayer(true);
						}else if(opt == 2){
							assistantCoach.setProfessionalPlayer(false);
						}
						break;
						case 5:
						System.out.println("Enter the assistant coach's new expertise 1. Offensive / 2. Defensive / 3. Possession / 4. Laboratory plays):");
						opt = sc.nextInt();
						sc.nextLine();
						assistantCoach.changeSpecialty(opt);
						break;
					}
				}
				System.out.println("Action done successfully.\nPress enter to continue.");
				sc.nextLine();
			}while(option != 0);
			break;
			case UPDATE_TEAM_NAME:
			System.out.println("1. Team A / 2. Team B:");
			option = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the team's new name:");
			name = sc.nextLine();
			switch(option){
				case 1:
				sportClub.getTeamA().setName(name);
				break;
				case 2:
				sportClub.getTeamB().setName(name);
				break;
			}
			System.out.println("Action done successfully.\nPress enter to continue.");
			sc.nextLine();
			break;
			case CREATE_LINEUP:
			System.out.println("Enter a day:");
			day = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a month:");
			month = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a year:");
			year = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a tactic (1. Possession / 2. Counterattack / 3. High_pressure / 4. Default):");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt){
				case 1:
				tactic = Tactics.Possession;
				break;
				case 2:
				tactic = Tactics.Counterattack;
				break;
				case 3:
				tactic = Tactics.High_pressure;
				break;
				case 4:
				tactic = Tactics.Default;
				break;
			}
			System.out.println("Enter a lineup (For example: 4-4-2):");
			text = sc.nextLine();
			System.out.println("1. Team A / 2. Team B:");
			option = sc.nextInt();
			sc.nextLine();
			switch(option){
				case 1:
				sportClub.getTeamA().addLineup(day, month, year, tactic, text);
				break;
				case 2:
				sportClub.getTeamB().addLineup(day, month, year, tactic, text);
				break;
			}
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case ADD_TO_DRESSINGROOM:
			System.out.println("Enter the employee's identifier:");
			identifier = sc.nextInt();
			sc.nextLine();
			System.out.println("1. RoomA / 2. RoomB:");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt){
				case 1:
				System.out.println(sportClub.addToDressingRoom(identifier, true));
				break;
				case 2:
				System.out.println(sportClub.addToDressingRoom(identifier, false));
				break;
			}
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case ADD_TO_OFFICES:
			System.out.println("Enter the employee's identifier:");
			identifier = sc.nextInt();
			sc.nextLine();
			System.out.println(sportClub.addToOffices(identifier));
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case SHOW_CLUB_INFORMATION:
			System.out.println(sportClub.showInfo());
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case SHOW_TEAMS_INFORMATION:
			System.out.println(sportClub.showTeamInfo());
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case SHOW_EMPLOYEES_INFORMATION:
			System.out.println(sportClub.showEmployeeInfo());
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case SHOW_DRESSING_ROOM:
			System.out.println("1. RoomA / 2. RoomB:");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt){
				case 1:
				System.out.println(sportClub.showDressingRoom(true));
				System.out.println("Press enter to continue.");
				sc.nextLine();
				break;
				case 2:
				System.out.println(sportClub.showDressingRoom(false));
				System.out.println("Press enter to continue.");
				sc.nextLine();
				break;
			}
			break;
			case SHOW_OFFICES:
			System.out.println(sportClub.showOffices());
			System.out.println("Press enter to continue.");
			sc.nextLine();
			break;
			case SHOW_LINEUPS:
			System.out.println("1. Team A / 2. Team B:");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt){
				case 1:
				System.out.println(sportClub.getTeamA().showLineupInfo());
				System.out.println("Press enter to continue.");
				sc.nextLine();
				break;
				case 2:
				System.out.println(sportClub.getTeamB().showLineupInfo());
				System.out.println("Press enter to continue.");
				sc.nextLine();
				break;
			}
			break;
			case EXIT:
			break;
		}
		
	}
	
}