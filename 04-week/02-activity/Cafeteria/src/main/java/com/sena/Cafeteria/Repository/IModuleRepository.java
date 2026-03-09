package com.sena.Cafeteria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Cafeteria.Entity.Module;

public interface IModuleRepository extends JpaRepository<Module, Long> {

}