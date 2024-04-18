package br.thullyo.pagamentomicroservice.dtos.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressRequestDTO {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
}
