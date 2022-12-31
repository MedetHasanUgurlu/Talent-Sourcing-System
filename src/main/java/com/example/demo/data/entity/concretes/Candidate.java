package com.example.demo.data.entity.concretes;

import com.example.demo.data.entity.concretes.enums.PreInteraction;
import com.example.demo.data.entity.concretes.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surName;
    private String contactInformation;

    @Enumerated(EnumType.STRING)
    private PreInteraction preInteraction;

    @Enumerated(EnumType.STRING)
    private Status status;





}
