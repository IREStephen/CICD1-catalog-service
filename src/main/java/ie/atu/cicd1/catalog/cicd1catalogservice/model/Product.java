package ie.atu.cicd1.catalog.cicd1catalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private Long id;
    private BigDecimal name;
    private Double price;
}
