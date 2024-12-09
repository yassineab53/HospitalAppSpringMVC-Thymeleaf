package net.yassine.hospiralappspringmvc.web;

import net.yassine.hospiralappspringmvc.entities.Patient;
import net.yassine.hospiralappspringmvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    //injection des dependances via le constructeur   ou en utilisant l'annotation Autowired
    /*public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }*/

    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("listPatients", patients);

        return "patients";
    }
}
