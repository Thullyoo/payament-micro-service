package br.thullyo.pagamentomicroservice.controllers;

import br.thullyo.pagamentomicroservice.dtos.request.CartaoRequestDTO;
import br.thullyo.pagamentomicroservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/verify")
    public ResponseEntity<String> verifyPayment(@RequestBody CartaoRequestDTO cartaoRequestDTO){
        if (paymentService.verifyPayment(cartaoRequestDTO)){
            return ResponseEntity.ok("Pagamento efetuado com sucesso!");
        }
        return ResponseEntity.badRequest().body("Não foi possível realizar pagamento");
    }
}
