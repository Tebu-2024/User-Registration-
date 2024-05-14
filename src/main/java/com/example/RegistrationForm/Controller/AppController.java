package com.example.RegistrationForm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegistrationForm.UserRepository;
import com.example.RegistrationForm.Entity.EntityClass;





@Service
@Controller
@RestController
@EnableAutoConfiguration
public class AppController {
@Autowired
private  UserRepository repo;

@GetMapping("/button-onClick")
      public String home(){
            return "index";
      }


@PostMapping("/process_register")
      public EntityClass processRegistration(@RequestBody EntityClass user){
            
            return repo.save(user);
      }

 
       
    
    

}
