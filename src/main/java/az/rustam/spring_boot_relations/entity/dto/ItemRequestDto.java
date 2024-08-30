package az.rustam.spring_boot_relations.entity.dto;

import az.rustam.spring_boot_relations.entity.CartEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class ItemRequestDto {

    private String name;

    private BigDecimal price;

    private Long cart_id;

    private Integer productCount;
}
