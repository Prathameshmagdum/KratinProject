package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Health_Monitoring")
public class HealthMonitoring {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int HeartRate;
	private String BloodPress;
	private String ActivityLevel;
	
	@OneToOne(mappedBy="healthmoni",cascade=CascadeType.ALL)
	private Medication medication;
	
	public HealthMonitoring(long id, int heartRate, String bloodPress, String activityLevel) {
		super();
		this.id = id;
		HeartRate = heartRate;
		BloodPress = bloodPress;
		ActivityLevel = activityLevel;
	}
	
	public HealthMonitoring() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getHeartRate() {
		return HeartRate;
	}

	public void setHeartRate(int heartRate) {
		HeartRate = heartRate;
	}

	public String getBloodPress() {
		return BloodPress;
	}

	public void setBloodPress(String bloodPress) {
		BloodPress = bloodPress;
	}

	public String getActivityLevel() {
		return ActivityLevel;
	}

	public void setActivityLevel(String activityLevel) {
		ActivityLevel = activityLevel;
	}

	@Override
	public String toString() {
		return "HealthMonitoring [id=" + id + ", HeartRate=" + HeartRate + ", BloodPress=" + BloodPress
				+ ", ActivityLevel=" + ActivityLevel + "]";
	}
	
}
