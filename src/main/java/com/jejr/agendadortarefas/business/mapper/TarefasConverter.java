package com.jejr.agendadortarefas.business.mapper;

import com.jejr.agendadortarefas.business.dto.TarefasDTO;
import com.jejr.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {
  TarefasEntity paraTarefaEntity(TarefasDTO dto);

  TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
