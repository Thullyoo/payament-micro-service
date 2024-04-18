package br.thullyo.pagamentomicroservice.dtos.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
@Builder
@Getter
public class CartaoRequestDTO {

    private String number;
    private String numberCard;
    private String month;
    private String year;
    private String cvv;
    private BigDecimal value;
    private AddressRequestDTO adress;
}
