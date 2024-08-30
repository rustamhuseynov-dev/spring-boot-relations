package az.rustam.spring_boot_relations.entity.dto;

import az.rustam.spring_boot_relations.entity.ItemEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
public class ItemResponseDto {

    private String name;
    private BigDecimal price;
}
