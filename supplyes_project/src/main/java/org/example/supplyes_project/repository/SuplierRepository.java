package org.example.supplyes_project.repository;

import org.example.supplyes_project.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SuplierRepository extends JpaRepository<Supplier, Integer> {
}
