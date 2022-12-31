package com.example.demo.api.abstracts;

import com.example.demo.business.Request.CandidateCreateRequest;
import com.example.demo.business.Response.CandidateCreateResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ICandidateController {

    ResponseEntity<CandidateCreateResponse> createCandidate(CandidateCreateRequest request);
    ResponseEntity<Map<Boolean,String>> deleteCandidate(Long id);
    ResponseEntity<List<CandidateCreateResponse>> listCandidate();
}
