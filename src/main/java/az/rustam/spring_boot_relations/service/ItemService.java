package az.rustam.spring_boot_relations.service;

import az.rustam.spring_boot_relations.entity.dto.ItemRequestDto;
import az.rustam.spring_boot_relations.entity.dto.ItemResponseDto;

public interface ItemService {
    ItemResponseDto addItem(ItemRequestDto itemRequestDto);
}
