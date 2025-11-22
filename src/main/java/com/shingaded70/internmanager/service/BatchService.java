package com.shingaded70.internmanager.service;

import com.shingaded70.internmanager.model.Batch;
import com.shingaded70.internmanager.repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BatchService {
    @Autowired
    private BatchRepository batchRepository;

    public Batch createBatch(LocalDate startDate) {
        Batch batch = new Batch(startDate);
        return batchRepository.save(batch);
    }

    public List<Batch> getAllBatches() {
        return batchRepository.findAll();
    }
}