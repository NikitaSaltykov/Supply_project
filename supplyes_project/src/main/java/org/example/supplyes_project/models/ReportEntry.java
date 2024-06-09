package org.example.supplyes_project.models;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportEntry {
    private String supplierName;
    private String fruitName;
    private double totalWeight;
    private double totalCost;
}
