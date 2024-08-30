package az.rustam.spring_boot_relations.rest;

import az.rustam.spring_boot_relations.entity.dto.CartRequestDto;
import az.rustam.spring_boot_relations.entity.dto.CartResponseDto;
import az.rustam.spring_boot_relations.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping
    public ResponseEntity<CartResponseDto> cartAdd(@RequestBody CartRequestDto cartRequestDto){
        return new ResponseEntity<>(cartService.cartAdd(cartRequestDto), HttpStatus.CREATED);
    }
}
