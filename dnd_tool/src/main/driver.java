package main;
import Game_Objects.character;
import Dice_Roll.Randomizer;

public class driver {


	
	public static character createchar(int str, int dex, int con, int intel, int wis, int chari){
		character newchar = new character(str, dex, con, intel, wis, chari);
		return newchar;
	}
	
	public static void main(String[] args) {
		character newchar = createchar(new Randomizer(1,20).getdiceRoll(),new Randomizer(1,20).getdiceRoll(), new Randomizer(1,20).getdiceRoll(), new Randomizer(1,20).getdiceRoll(), new Randomizer(1,20).getdiceRoll(), new Randomizer(1,20).getdiceRoll());
		newchar.updatesavingthrowbonus();
		System.out.println(newchar);
		System.out.println(newchar.getbasestats());
		newchar.modifybasestat("Strength", 2);
		System.out.println(newchar.getbasestats());
		newchar.updatesavingthrowbonus();
		System.out.println(newchar);
		}
}
