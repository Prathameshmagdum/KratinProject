package Bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
@Entity
@Table(name="Medication")
public class Medication {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private String name;
	private String schedule;
	private String interaction;
	
	public Medication(long id, String name, String schedule, String interaction) {
		super();
		Id = id;
		this.name = name;
		this.schedule = schedule;
		this.interaction = interaction;
	}
	public Medication() {
		super();
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getInteraction() {
		return interaction;
	}
	public void setInteraction(String interaction) {
		this.interaction = interaction;
	}
	@Override
	public String toString() {
		return "Medication [Id=" + Id + ", name=" + name + ", schedule=" + schedule + ", interaction=" + interaction
				+ "]";
	}
	
	
}
