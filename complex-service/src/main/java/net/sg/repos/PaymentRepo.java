package net.sg.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sg.beans.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
