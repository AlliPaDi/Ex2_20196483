package com.example.ex2_20196483.repository;

import com.example.ex2_20196483.entity.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JuegosRepository extends JpaRepository<Juegos, Integer>{
}
