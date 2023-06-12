package Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Bean.HealthMonitoring;

@Repository
public interface HealthMonitoringDao extends JpaRepository<HealthMonitoring,Long> {

}
