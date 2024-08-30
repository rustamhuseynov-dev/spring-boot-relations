package az.rustam.spring_boot_relations.service.impl;

import az.rustam.spring_boot_relations.entity.dto.CartRequestDto;
import az.rustam.spring_boot_relations.entity.dto.CartResponseDto;
import az.rustam.spring_boot_relations.repository.CartRepository;
import az.rustam.spring_boot_relations.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public CartResponseDto cartAdd(CartRequestDto cartRequestDto) {
        return null;
    }
}
