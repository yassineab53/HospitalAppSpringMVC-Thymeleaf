package net.yassine.hospiralappspringmvc.repository;


import net.yassine.hospiralappspringmvc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
