package com.spring.io.project.application.mappers;

import com.spring.io.project.application.models.response.BuscarLeitorResponse;
import com.spring.io.project.domain.entities.LeitorEntity;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BuscarLeitorUseCaseMapper {
    default List<BuscarLeitorResponse> mapearBuscarLeitorEntityParaResponseUseCase(List<LeitorEntity> leitorEntities){
        List<BuscarLeitorResponse> result = new ArrayList<>();
        for (LeitorEntity l : leitorEntities) {
            BuscarLeitorResponse r = new BuscarLeitorResponse();
            r.setCodigoLeitor(l.getCodigoLeitor());
            r.setNomeLeitor(l.getNomeLeitor());
            r.setMatriculaLeitor(l.getMatriculaLeitor());
            r.setSituacao(l.getSituacao().getCodigoSituacao());
            r.setTipo(l.getTipo().getCodigoTipo());
            r.setDataCadastro(l.getDataCadastro());
            result.add(r);
        }
        return result;
    }
}
