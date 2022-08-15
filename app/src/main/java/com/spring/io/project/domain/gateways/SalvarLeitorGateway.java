package com.spring.io.project.domain.gateways;

import com.spring.io.project.application.models.request.SalvarLeitorRequest;
import com.spring.io.project.domain.entities.LeitorEntity;

public interface SalvarLeitorGateway {
    LeitorEntity salvarLeitorGateway(SalvarLeitorRequest request);
}
