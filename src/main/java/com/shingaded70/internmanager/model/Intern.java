package com.shingaded70.internmanager.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "intern", uniqueConstraints = @UniqueConstraint(columnNames = "intern_id"))
public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "intern_id", nullable = false, unique = true)
    private String internId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String mobile;

    @Column(name = "id_card_type", nullable = false)
    private String idCardType; // "Free" or "Premium"

    @Column(name = "date_of_joining", nullable = false)
    private LocalDate dateOfJoining;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batch_id", nullable = false)
    private Batch batch;

    // Constructors
    public Intern() {}

    public Intern(String name, String email, String mobile, String idCardType,
                  LocalDate dateOfJoining, Batch batch) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.idCardType = idCardType;
        this.dateOfJoining = dateOfJoining;
        this.batch = batch;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getInternId() { return internId; }
    public void setInternId(String internId) { this.internId = internId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getIdCardType() { return idCardType; }
    public void setIdCardType(String idCardType) { this.idCardType = idCardType; }

    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public void setDateOfJoining(LocalDate dateOfJoining) { this.dateOfJoining = dateOfJoining; }

    public Batch getBatch() { return batch; }
    public void setBatch(Batch batch) { this.batch = batch; }
}