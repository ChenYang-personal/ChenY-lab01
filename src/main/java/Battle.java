public class Battle {
	public String Name1;
	public float attack1;
	public float defence1;
	public float HP1;
	
	public String Name2;
	public float attack2;
	public float defence2;
	public float HP2;
	
	public int round_num = 1;
	
	Battle() {
	}
	
	Battle(String Name1, float attack1, float defence1, float HP1, String Name2, float attack2, float defence2, float HP2) {
		this.Name1 = Name1;
		this.Name2 = Name2;
		this.attack1 = attack1;
		this.attack2 = attack2;
		this.defence1 = defence1;
		this.defence2 = defence2;
		this.HP1 = HP1;
		this.HP2 = HP2;
	}
	
	String getMonster1Name(){
		return Name1;
	}
	float getMonster1Attack() {
		return attack1;
	}
	float getMonster1defense() {
		return defence1;
	}
	float getMonster1HP() {
		return HP1;
	}
	
	String getMonster2Name(){
		return Name2;
	}
	float getMonster2Attack() {
		return attack2;
	}
	float getMonster2defense() {
		return defence2;
	}
	float getMonster2HP() {
		return HP2;
	}
	
	boolean isMonster1Dead() {
		if(HP1<=0) {
			return true;
		}else {
			return false;
		}
	}
	boolean isMonster2Dead() {
		if(HP2<=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void simulateRound(){
		float damage1;
		float damage2;
		damage1 = attack1 - defence2;
		damage2 = attack2 - defence1;
		HP1 = HP1 - damage2;
		HP2 = HP2 - damage1;
		System.out.printf("Round: ", round_num);
		System.out.printf("Chikapu does %f points of damage to Zarichard", damage1);
		System.out.printf("Zarichard does %f points of damage to Chikapu", damage2);
		System.out.printf("Chikapu: ", HP1);
		System.out.printf("Zarichard: ", HP2);
		round_num++;
	}   
    

}
