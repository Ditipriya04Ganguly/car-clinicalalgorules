package com.CAR.ClinicalAlgorithmRules.controller;

import com.CAR.ClinicalAlgorithmRules.model.ListOfPatient;
import com.CAR.ClinicalAlgorithmRules.model.Patient;
import com.CAR.ClinicalAlgorithmRules.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/addpatient")
    public String addPatientInForm(@RequestBody Patient patient){
        patientService.addPatientToForm(patient);
        return "Success";
    }

    @GetMapping("/getpatient")
    public List<Patient> getPatientFromForm(){
        return patientService.getPatientFromForm();
    }

}
