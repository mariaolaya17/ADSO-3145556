package com.sena.Cafeteria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Cafeteria.Entity.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
