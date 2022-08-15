package com.spring.io.project.application.usecases;

import com.spring.io.project.application.models.request.SalvarLeitorRequest;
import com.spring.io.project.application.models.response.SalvarLeitorResponse;

public interface SalvarLeitorUseCase {
    SalvarLeitorResponse salvarLeitorUseCase(SalvarLeitorRequest request);
}
