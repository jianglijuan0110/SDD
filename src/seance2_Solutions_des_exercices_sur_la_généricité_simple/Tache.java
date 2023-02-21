package seance2_Solutions_des_exercices_sur_la_généricité_simple;

public class Tache {
	private String id, type;
	
	public Tache() {
	}

	public Tache(String id, String type) {
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tache [id=" + id + ", type=" + type + "]";
	}

}
