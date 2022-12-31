package com.example.demo.business.concretes;

import com.example.demo.business.Request.CandidateCreateRequest;
import com.example.demo.business.Response.CandidateCreateResponse;
import com.example.demo.business.abstracts.ICandidateService;
import com.example.demo.core.bean.ModelMapperBean;
import com.example.demo.data.entity.concretes.Candidate;
import com.example.demo.data.repository.ICandidateRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CandidateService implements ICandidateService {

    private  final ICandidateRepository repository;
    private  final ModelMapperBean modelMapper;

    @Override
    public CandidateCreateResponse create(CandidateCreateRequest request) {
        Candidate candidate = createRequestToCandidate(request);
        repository.save(candidate);
        CandidateCreateResponse response = createCandidateToResponse(candidate);
        return response;
    }

    @Override
    public Map<Boolean, String> delete(Long id) {
        Map<Boolean,String> map = new HashMap<>();
        Candidate candidate = repository.findById(id).get();
        repository.delete(candidate);
        map.put(true,"Deleted");
        return map;
    }


    public CandidateCreateResponse requestToResponse(CandidateCreateRequest request){
        CandidateCreateResponse response = modelMapper.modelMapperMethod().map(request,CandidateCreateResponse.class);
        return response;
    }
    public Candidate createRequestToCandidate(CandidateCreateRequest request){
        Candidate candidate = modelMapper.modelMapperMethod().map(request,Candidate.class);
        return candidate;
    }

    public CandidateCreateResponse createCandidateToResponse(Candidate candidate){
        CandidateCreateResponse response = modelMapper.modelMapperMethod().map(candidate,CandidateCreateResponse.class);
        return response;
    }



}
