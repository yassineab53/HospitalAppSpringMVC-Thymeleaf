package net.yassine.hospiralappspringmvc.web;

import net.yassine.hospiralappspringmvc.repository.PatientRepository;
import org.springframework.stereotype.Controller;

@Controller
public class PatientController {
    private PatientRepository patientRepository;
    //injection des dependances via le constructeur
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
}
