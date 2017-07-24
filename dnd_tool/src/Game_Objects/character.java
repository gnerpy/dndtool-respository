package Game_Objects;
import java.util.Enumeration;
import java.util.Hashtable;

public class character {

	Hashtable<String, String> baseinfo;
	Hashtable<String, Integer> basestats;
	Hashtable<String, Integer> savingthrows;
	Hashtable<String, Integer> lvlup;
	
	
	public character(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
		Hashtable<String, Integer> basestathold = new Hashtable<String, Integer>();
		basestathold.put("Strength", strength);
		basestathold.put("Dexterity", dexterity);
		basestathold.put("Consitution", constitution);
		basestathold.put("Intelligence", intelligence);
		basestathold.put("Wisdom", wisdom);
		basestathold.put("Charisma", charisma);
		this.basestats = basestathold;
		Hashtable<String, String> baseinfohold = new Hashtable<String, String>();
		this.baseinfo = baseinfohold;
		Hashtable<String, Integer> savingthrowhold = new Hashtable<String, Integer>();
		this.savingthrows = savingthrowhold;
		Hashtable<String, Integer> lvluphold = new Hashtable<String, Integer>();
		this.lvlup = lvluphold;
	}
	
	public int modifyBonusCalc(int inputint){
		inputint = inputint - 10;
		int outputint = (int)Math.floor(inputint/2);
		return outputint;
		
	}
	
	public void calcProfBonus(int currlevel){
		int newprof = 0;
		if (currlevel >= 1 && currlevel <= 4){
			newprof = 2;
		}
		else if (currlevel >=5 && currlevel <= 8){
			newprof = 3;
		}
		else if (currlevel >= 9 && currlevel <= 12){
			newprof = 4;
		}
		else if (currlevel >= 13 && currlevel <= 16){
			newprof = 5;
		}
		else if (currlevel >= 17 && currlevel <= 20){
			newprof = 6;
		}
		lvlup.put("Proficiency", newprof);
	}
	
	public void modifybasestat(String key, int modify){
		basestats.put(key, basestats.get(key) + modify);
	}
	
	public void modifysavingthrow(String key, int modify){
		savingthrows.put(key, savingthrows.get(key) + modify);
	}
	
	public void modifylvlup(String key, int modify){
		lvlup.put(key, lvlup.get(key) + modify);
	}
	
	public void updatesavingthrowbonus(){
		Enumeration<String> enumkey = basestats.keys();
		while(enumkey.hasMoreElements()) {
			String key = enumkey.nextElement();
			int val = basestats.get(key);
			savingthrows.put(key,  modifyBonusCalc(val));
		}
		
	}
	
	public Hashtable<String, Integer> getbasestats(){
		return basestats;
	}
	public String toString(){
		return savingthrows.toString();
	}
	
	
}
