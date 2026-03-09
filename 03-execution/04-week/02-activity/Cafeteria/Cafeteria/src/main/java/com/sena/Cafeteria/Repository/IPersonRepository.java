package com.sena.Cafeteria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Cafeteria.Entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}