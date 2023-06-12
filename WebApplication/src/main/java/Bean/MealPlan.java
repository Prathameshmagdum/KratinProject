package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Meal_Plan")
public class MealPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String name;
	private String description;
	private int calories;
	
	@ManyToOne
	@JoinColumn(name="Health_Monitoring_id")
	private HealthMonitoring healthmoni;
	
	public MealPlan(long id, String name, String description, int calories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	public MealPlan() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "MealPlan [id=" + id + ", name=" + name + ", description=" + description + ", calories=" + calories
				+ "]";
	}
	
	
}
