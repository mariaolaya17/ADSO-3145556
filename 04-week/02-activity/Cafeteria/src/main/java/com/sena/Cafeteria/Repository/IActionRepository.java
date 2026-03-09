package com.sena.Cafeteria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Cafeteria.Entity.Action;

public interface IActionRepository extends JpaRepository<Action, Long>{

}
