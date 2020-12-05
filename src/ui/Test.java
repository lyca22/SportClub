package ui;
import model.*;

public class Test{
	
	public static void main(String[] args){
		
		SportClub newSportClub = new SportClub("name", 123456, 1, 1, 2020, "A", "B");
		newSportClub.addEmployee("Messi", 101010, 100000, 20, 8.5, Positions.Forward);
		newSportClub.addEmployee("Pekerman", 101214, 100000, 4, 2, 1);
		newSportClub.addEmployee("Willy", 101112, 100000, 2, true, Specialty.Possession);
		System.out.println(newSportClub.showEmployeeInfo());
		for(int i = 0; i < 50; i++){
			newSportClub.addToDressingRoom(101010, true);
			newSportClub.addToDressingRoom(101010, false);
		}
		
		for(int i = 0; i < 50; i++){
			newSportClub.addToOffices(101214);
		}
		
		System.out.println(newSportClub.showDressingRoom(true));
		System.out.println(newSportClub.showDressingRoom(false));
		System.out.println(newSportClub.showOffices());
		
		newSportClub.getTeamA().addPlayer(newSportClub.searchEmployee(101010), 10);
		newSportClub.getTeamA().addCoach(newSportClub.searchEmployee(101214));
		newSportClub.getTeamA().addCoach(newSportClub.searchEmployee(101112));
		newSportClub.getTeamA().addLineup(22, 06, 2021, Tactics.Counterattack, "4-4-2");
		
		System.out.println(newSportClub.showTeamInfo());
		
		System.out.println(newSportClub.removeEmployee(101112));
		
		System.out.println(newSportClub.showEmployeeInfo());
		
	}
	
}