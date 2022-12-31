package com.example.demo.business.Response;

import com.example.demo.data.entity.concretes.enums.PreInteraction;
import com.example.demo.data.entity.concretes.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidateCreateResponse {
    private String name;
    private String surName;
    private String contactInformation;
    private PreInteraction preInteraction;
    private Status status;
}
