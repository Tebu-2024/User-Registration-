package com.example.RegistrationForm;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegistrationForm.Entity.EntityClass;


public interface UserRepository extends JpaRepository<EntityClass,Long> {
    
    EntityClass findByEmail(String email);

}
