package br.janioofi.financialcontrol.domain.repositories;

import br.janioofi.financialcontrol.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    @Query(value = "SELECT * FROM tb_payment WHERE id_category = :id",  nativeQuery = true)
    Optional<List<Payment>> findPaymentByCategory(@Param("id") Long id);
}
