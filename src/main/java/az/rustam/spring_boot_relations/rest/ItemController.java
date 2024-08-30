package az.rustam.spring_boot_relations.rest;

import az.rustam.spring_boot_relations.entity.dto.ItemRequestDto;
import az.rustam.spring_boot_relations.entity.dto.ItemResponseDto;
import az.rustam.spring_boot_relations.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<ItemResponseDto> addItem(@RequestBody ItemRequestDto itemRequestDto){
        System.out.println(itemRequestDto);
        return new ResponseEntity<>(itemService.addItem(itemRequestDto), HttpStatus.CREATED);
    }
}
