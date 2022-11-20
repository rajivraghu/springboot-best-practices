package com.javatechie.dto;

import org.mapstruct.*;

import com.javatechie.entity.Appuser;

/**
 * Mapper for the entity {@link Appuser} and its DTO {@link AppuserDTO}.
 */
@Mapper(componentModel = "spring")
public interface AppuserMapper extends EntityMapper<AppuserDTO, Appuser> {}