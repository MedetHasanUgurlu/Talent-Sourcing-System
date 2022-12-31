package com.example.demo.business.abstracts;

import com.example.demo.business.Request.CandidateCreateRequest;
import com.example.demo.business.Response.CandidateCreateResponse;

import java.util.List;
import java.util.Map;


public interface ICandidateService {
    CandidateCreateResponse create(CandidateCreateRequest request);
    Map<Boolean,String> delete(Long id);

    List<CandidateCreateResponse> list();

}
