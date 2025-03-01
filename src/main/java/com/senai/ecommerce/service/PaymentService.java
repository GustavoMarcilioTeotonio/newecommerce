package com.senai.ecommerce.service;

import com.senai.ecommerce.Repository.PaymentRepository;
import com.senai.ecommerce.dtos.PaymentDTO;
import com.senai.ecommerce.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class PaymentService {


    public PaymentDTO findById(Long id) {
        @Autowired
        private PaymentRepository paymentRepository;

        @Transactional(readOnly = true)
        public PaymentDTO findById(Long id) {
            Payment payment = paymentRepository.findById(id).orElseThrow();
            return paymentToPaymentDTO(payment);
        }


    }

    private PaymentDTO paymentToPaymentDTO(Payment payment) {
    }
}
