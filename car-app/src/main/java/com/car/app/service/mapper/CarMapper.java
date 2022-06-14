package com.car.app.service.mapper;

import com.car.app.domain.Car;
import com.car.app.service.dto.CarDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Car} and its DTO {@link CarDTO}.
 */
@Mapper(componentModel = "spring")
public interface CarMapper extends EntityMapper<CarDTO, Car> {}
