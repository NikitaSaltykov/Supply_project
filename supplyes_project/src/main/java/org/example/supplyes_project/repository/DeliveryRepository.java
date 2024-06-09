package org.example.supplyes_project.repository;

import org.example.supplyes_project.models.Delivery;
import org.example.supplyes_project.models.ReportEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Integer> {
    @Query("SELECT new org.example.supplyes_project.models.ReportEntry(d.supplier.name, d.fruit.name, SUM(d.weight), SUM(d.weight * d.fruit.pricePerKg)) " +
            "FROM Delivery d " +
            "WHERE d.deliveryDate BETWEEN :startDate AND :endDate " +
            "GROUP BY d.supplier.name, d.fruit.name")
    List<ReportEntry> generateReportByDateRange(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}
