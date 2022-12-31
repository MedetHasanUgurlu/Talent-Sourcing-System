package com.example.demo.core.bean;

import com.example.demo.business.Request.CandidateCreateRequest;
import com.example.demo.business.concretes.CandidateService;
import com.example.demo.data.entity.concretes.enums.PreInteraction;
import com.example.demo.data.entity.concretes.enums.Status;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReadyData {




    @Bean
    CommandLineRunner candidateReadyData(CandidateService service){
      return(args)->{
          CandidateCreateRequest request = new CandidateCreateRequest();
          request.setStatus(Status.HIRED);
          request.setName("Medet");
          request.setSurName("Uğurlu");
          request.setPreInteraction(PreInteraction.EMAIL);
          request.setContactInformation("Esenyalı Mah. Nılufer Sokak");
          service.create(request);
      };

      }


    };

