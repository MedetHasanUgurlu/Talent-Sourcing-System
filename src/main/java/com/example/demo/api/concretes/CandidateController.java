package com.example.demo.api.concretes;

import com.example.demo.api.abstracts.ICandidateController;
import com.example.demo.business.Request.CandidateCreateRequest;
import com.example.demo.business.Response.CandidateCreateResponse;
import com.example.demo.business.concretes.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/candidate")
@CrossOrigin(origins = "http://localhost:3000")
public class CandidateController implements ICandidateController {

    private CandidateService service;

    @Autowired
    public CandidateController(CandidateService service) {
        this.service = service;
    }


    @Override
    @PostMapping
    public ResponseEntity<CandidateCreateResponse> createCandidate(@RequestBody CandidateCreateRequest request) {
        if(request == null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        service.create(request);
        CandidateCreateResponse response = service.requestToResponse(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<Boolean, String>> deleteCandidate(@PathVariable Long id) {
        Map<Boolean,String> result = new HashMap<>();
        if(id == null){
            result.put(false,"Not Deleted");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(result);
        }
        result = service.delete(id);
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<List<CandidateCreateResponse>> listCandidate() {
        return null;
    }


}
