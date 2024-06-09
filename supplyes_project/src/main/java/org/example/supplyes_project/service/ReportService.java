package org.example.supplyes_project.service;

import org.example.supplyes_project.models.ReportEntry;
import org.example.supplyes_project.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@Service
@Transactional
public class ReportService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public List<ReportEntry> generateReportByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return deliveryRepository.generateReportByDateRange(startDate, endDate);
    }
}
