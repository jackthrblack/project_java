package project1;


public class MonsterDTO {

	private String name;
	private int hp;
	private int att;
	private int dep;
	
	MonsterDTO(){
		
	}

	public MonsterDTO(String name, int hp, int att, int dep) {
		this.name=name;
		this.hp = hp;
		this.att = att;
		this.dep = dep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public int setHp(int hp) {
		return this.hp = hp;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "MonsterDTO [name=" + name + ", hp=" + hp + ", att=" + att + ", dep=" + dep + "]";
	}
}
