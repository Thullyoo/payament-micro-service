package br.thullyo.pagamentomicroservice.services;

import br.thullyo.pagamentomicroservice.dtos.request.CartaoRequestDTO;
import br.thullyo.pagamentomicroservice.infra.PaymentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentClient paymentClient;

    public Boolean verifyPayment(CartaoRequestDTO cartaoRequestDTO){
        return paymentClient.validatePayment(cartaoRequestDTO);
    }
}
