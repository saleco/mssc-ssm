package guru.springframework.ssm.msscssm.repository;

import guru.springframework.ssm.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
