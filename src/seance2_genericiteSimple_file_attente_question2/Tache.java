package seance2_genericiteSimple_file_attente_question2;

import java.util.Objects;

public class Tache {
	@Override
	public String toString() {
		return "Tache [id=" + id + ", type=" + type + "]";
	}
	private int id;
	private String type;
	
	public Tache() {
		super();
	}
	public Tache(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tache other = (Tache) obj;
		return id == other.id && Objects.equals(type, other.type);
	}
	
	
	
}
