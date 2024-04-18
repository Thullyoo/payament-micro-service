package br.thullyo.pagamentomicroservice.infra;

import br.thullyo.pagamentomicroservice.dtos.request.CartaoRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class PaymentClient {

    public Boolean validatePayment(CartaoRequestDTO cartaoRequestDTO){
        return cartaoRequestDTO.getNumberCard().endsWith("1030");
    }
}
