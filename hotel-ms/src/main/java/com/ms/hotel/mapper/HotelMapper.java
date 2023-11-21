package com.ms.hotel.mapper;

import com.ms.hotel.dto.HotelDTO;
import com.ms.hotel.model.HotelEntity;

public class HotelMapper {
    public static HotelEntity mappingHotelDtoToHotelEntity(HotelDTO hotel){
        return HotelEntity.builder()
                .information(hotel.getInformation())
                .name(hotel.getName())
                .location(hotel.getLocation())
                .build();
    }
}
