package az.rustam.spring_boot_relations.service;

import az.rustam.spring_boot_relations.entity.dto.CartRequestDto;
import az.rustam.spring_boot_relations.entity.dto.CartResponseDto;

public interface CartService {

    CartResponseDto cartAdd(CartRequestDto cartRequestDto);
}
