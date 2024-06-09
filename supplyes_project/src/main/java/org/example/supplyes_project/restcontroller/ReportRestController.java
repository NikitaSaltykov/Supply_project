package org.example.supplyes_project.restcontroller;

import org.example.supplyes_project.models.ReportEntry;
import org.example.supplyes_project.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportRestController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/")
    public List<ReportEntry> generateReportByDateRange(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDateTime startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDateTime endDate) {
        return reportService.generateReportByDateRange(startDate, endDate);
    }
}
