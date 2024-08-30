package az.rustam.spring_boot_relations.service.impl;

import az.rustam.spring_boot_relations.entity.CartEntity;
import az.rustam.spring_boot_relations.entity.ItemEntity;
import az.rustam.spring_boot_relations.entity.dto.ItemRequestDto;
import az.rustam.spring_boot_relations.entity.dto.ItemResponseDto;
import az.rustam.spring_boot_relations.repository.CartRepository;
import az.rustam.spring_boot_relations.repository.ItemRepository;
import az.rustam.spring_boot_relations.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    @Override
    public ItemResponseDto addItem(ItemRequestDto itemRequestDto) {
        ItemEntity itemEntity = ItemEntity.builder()
                .name(itemRequestDto.getName())
                .price(itemRequestDto.getPrice())
                .cart_id(saveCart(itemRequestDto.getCart_id()))
                .build();
        ItemEntity save = itemRepository.save(itemEntity);

        CartEntity cart = new CartEntity();
        cart.setItem_id(save.getId());
        cart.setProductCount(itemRequestDto.getProductCount());
        cartRepository.save(cart);

        return ItemResponseDto.builder()
                .name(itemRequestDto.getName())
                .price(itemRequestDto.getPrice())
                .build();
    }

    private Long saveCart(Long cartId) {
        return cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("id not found")).getId();
    }
}
