package org.example.supplyes_project.repository;

import org.example.supplyes_project.models.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
