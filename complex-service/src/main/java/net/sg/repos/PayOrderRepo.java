package net.sg.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sg.beans.PayOrder;
import net.sg.beans.Payment;

public interface PayOrderRepo extends JpaRepository<PayOrder, Long> {

}
