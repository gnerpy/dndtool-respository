package main;
import Dice_Roll.Randomizer;

public class testClass {

	public static void main(String[] args) {
		Randomizer n = new Randomizer(2, 20);
		System.out.println(n.getdiceRoll());
		System.out.println(n.getrolls());
				
		
	}

}
