package net.yassine.hospiralappspringmvc.web;

import net.yassine.hospiralappspringmvc.entities.Patient;
import net.yassine.hospiralappspringmvc.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String index(Model model, int page, int size){
        //List<Patient> patients = patientRepository.findAll();
        //en utilisant la pagination
        Page<Patient> patients = patientRepository.findAll(PageRequest.of(page, size));
        model.addAttribute("listPatients", patients);
        return "patients";
    }

    @GetMapping("/deletePatient")
    public String delete(@RequestParam(name = "id") Long id){
        patientRepository.deleteById(id);
        return "redirect:/index";
    }
}
