package com.senai.ecommerce.controllers;


import com.senai.ecommerce.dtos.PaymentDTO;
import com.senai.ecommerce.dtos.ProductDTO;
import com.senai.ecommerce.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{id}") //localhost:8080/api/payment/1
    public ResponseEntity<PaymentDTO> getPaymenteByid(@PathVariable Long id) {
        PaymentDTO paymentDTO = paymentService.findById(id);
        return ResponseEntity.ok(paymentDTO);
    }

//    @GetMapping
//    public ResponseEntity<List<PaymentDTO>> getAllPayment() {
//        List<PaymentDTO> list = PaymentService.findAll();
//        return ResponseEntity.ok(list);
//
//    }
//    //@PreAuthorize("hasRole('ADMIN')")
//    @PostMapping
//    public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO paymentDTO) {
//        PaymentDTO payment = PaymentService.create(PaymentDTO);//repository.save(paymentDTO);
//        return ResponseEntity.ok(payment);
//    }
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<PaymentDTO> updatePayment(@PathVariable Long id, @RequestBody PaymentDTO paymentDTO) {
//        PaymentDTO payment = PaymentService.update(id, PaymentDTO);
//        return ResponseEntity.ok(payment);
//    }
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
//        PaymentService.delete(id);
//        //resposta sem conteudo
//        return ResponseEntity.noContent().build();
//    }



}
