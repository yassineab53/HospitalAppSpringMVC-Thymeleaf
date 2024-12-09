package net.yassine.hospiralappspringmvc.web;

import net.yassine.hospiralappspringmvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    //injection des dependances via le constructeur   ou en utilisant l'annotation Autowired
    /*public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }*/

    @GetMapping("/index")
    public String index(){
        return "patients";
    }
}
