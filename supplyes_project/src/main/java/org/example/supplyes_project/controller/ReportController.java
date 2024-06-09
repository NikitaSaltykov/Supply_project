package org.example.supplyes_project.controller;


import org.example.supplyes_project.models.ReportEntry;
import org.example.supplyes_project.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;;
import java.util.List;

@Controller
@RequestMapping
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/report")
    public String showReportForm() {
        return "report-form";
    }

    @PostMapping("/list")
    public String generateReportByDateRange(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDateTime startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDateTime endDate,
            Model model) {
        List<ReportEntry> reportEntries = reportService.generateReportByDateRange(startDate, endDate);
        model.addAttribute("reportEntries", reportEntries);
        return "report-list";
    }
}
