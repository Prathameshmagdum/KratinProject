package HealthMonitoringServices;

import org.springframework.beans.factory.annotation.Autowired;

import Bean.HealthMonitoring;
import Dao.HealthMonitoringDao;

public class HealthMonitoringSeviceImpl implements HealthMonitoringService{

	@Autowired
	private HealthMonitoringDao healthmonitoringdao;
	
	@Override
	public HealthMonitoring saveHealthMonitoring(HealthMonitoring healthmonitoring) {
		// TODO Auto-generated method stub
		return healthmonitoringdao.save(healthmonitoring);
	}

}
