package com.example.healthcare.controller;

import com.example.healthcare.model.HealthRecord;
import com.example.healthcare.model.Patient;
import com.example.healthcare.repository.HealthRecordRepository;
import com.example.healthcare.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/records")
public class HealthRecordController {

    @Autowired
    private HealthRecordRepository healthRecordRepository;

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public List<HealthRecord> getAllRecords() {
        return healthRecordRepository.findAll();
    }

    @PostMapping("/patient/{patientId}")
public HealthRecord addRecord(@PathVariable Long patientId, @RequestBody HealthRecord healthRecord) {
    Patient patient = patientRepository.findById(patientId)
            .orElseThrow(() -> new RuntimeException("Patient not found"));

    healthRecord.setPatient(patient);

    if (healthRecord.getTimestamp() == null) {
        healthRecord.setTimestamp(LocalDateTime.now());
    }

    // 🔥 ADD THIS PART HERE
    if (healthRecord.getHeartRate() > 100) {
        System.out.println("ALERT: High heart rate detected for patient ID " + patientId);
    }

    return healthRecordRepository.save(healthRecord);
}
    @GetMapping("/patient/{patientId}")
    public List<HealthRecord> getRecordsByPatientId(@PathVariable Long patientId) {
      return healthRecordRepository.findByPatientId(patientId);
}
}