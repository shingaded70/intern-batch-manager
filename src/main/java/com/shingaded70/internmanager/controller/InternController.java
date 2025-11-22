package com.shingaded70.internmanager.controller;

import com.shingaded70.internmanager.model.Intern;
import com.shingaded70.internmanager.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/interns")
@CrossOrigin
public class InternController {

    @Autowired
    private InternService internService;

    @PostMapping
    public Intern addIntern(@RequestBody Intern intern) {
        return internService.addIntern(intern);
    }

    @GetMapping
    public Iterable<Intern> getAllInterns() {
        return internService.getAllInterns();
    }
}