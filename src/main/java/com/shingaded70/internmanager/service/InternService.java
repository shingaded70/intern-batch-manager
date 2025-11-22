package com.shingaded70.internmanager.service;

import com.shingaded70.internmanager.model.Batch;
import com.shingaded70.internmanager.model.Intern;
import com.shingaded70.internmanager.repository.BatchRepository;
import com.shingaded70.internmanager.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class InternService {
    @Autowired
    private InternRepository internRepository;

    @Autowired
    private BatchRepository batchRepository;

    public Intern addIntern(Intern intern) {
        Batch batch = batchRepository.findById(intern.getBatch().getId())
            .orElseThrow(() -> new RuntimeException("Batch not found"));

        String prefix = "Premium".equalsIgnoreCase(intern.getIdCardType()) ? "EMP" : "TDA";
        String datePart = intern.getDateOfJoining().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd"));
        long count = internRepository.countByInternIdStartingWith(prefix + datePart + "-");
        String internId = prefix + datePart + "-" + String.format("%03d", count + 1);

        intern.setInternId(internId);
        intern.setBatch(batch);
        return internRepository.save(intern);
    }

    public Iterable<Intern> getAllInterns() {
        return internRepository.findAll();
    }
}