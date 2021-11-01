package project1;

public class ChterDTO {

	private String id;
	private int hp;
	private int att;
	private int dep;
	private int potion;
	
	ChterDTO(){
		
	}

	public ChterDTO(String id, int hp, int att, int dep, int potion) {
		super();
		this.id = id;
		this.hp = hp;
		this.att = att;
		this.dep = dep;
		this.potion = potion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getPotion() {
		return potion;
	}

	public int setPotion(int potion) {
		return this.potion = potion;
	}

	@Override
	public String toString() {
		return "ChterDTO [id=" + id + ", hp=" + hp + ", att=" + att + ", dep=" + dep + ", potion=" + potion + "]";
	}
}