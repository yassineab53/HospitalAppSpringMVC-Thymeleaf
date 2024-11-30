package net.yassine.hospiralappspringmvc;

import net.yassine.hospiralappspringmvc.entities.Patient;
import net.yassine.hospiralappspringmvc.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospiralAppSpringMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(HospiralAppSpringMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(PatientRepository patientRepository){
        /*return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                //code
            }
        };*/
        return args -> {
            //premier solution pour creer des objets : NoArgsConstructor
            Patient p1 = new Patient();
            p1.setNom("Abbou");
            p1.setPrenom("Yassine");
            p1.setScore((100));
            p1.setMalade(false);
            p1.setDateNaissance(new Date());

            //2eme solution pour creer des objets : AllArgsConstructor
            Patient p2 = new Patient(null, "Abbou", "Aymane", new Date(), 50, false);

            //3eme solution : en utilisant @Builder : design pattern
            Patient p3 = Patient.builder()
                    .nom("Hassani")
                    .prenom("Achraf")
                    .dateNaissance(new Date())
                    .malade(false)
                    .score(10)
                    .build();

            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);

            List<Patient> patients = patientRepository.findAll();
            patients.forEach(p->{
                System.out.println(p.toString());
            });

        };
    }

}
