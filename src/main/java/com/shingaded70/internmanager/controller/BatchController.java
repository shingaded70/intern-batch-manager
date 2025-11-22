package com.shingaded70.internmanager.controller;

import com.shingaded70.internmanager.model.Batch;
import com.shingaded70.internmanager.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/batches")
@CrossOrigin
public class BatchController {

    @Autowired
    private BatchService batchService;

    @PostMapping
    public Batch createBatch(@RequestBody BatchRequest request) {
        return batchService.createBatch(LocalDate.parse(request.getStartDate()));
    }

    @GetMapping
    public List<Batch> getAllBatches() {
        return batchService.getAllBatches();
    }

    // Simple DTO for request body
    public static class BatchRequest {
        private String startDate;

        public String getStartDate() { return startDate; }
        public void setStartDate(String startDate) { this.startDate = startDate; }
    }
}