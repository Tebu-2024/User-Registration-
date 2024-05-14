// package com.example.RegistrationForm;
// import static org.assertj.core.api.Assertions.assertThat;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
// import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
// import org.springframework.test.annotation.Rollback;


// @DataJpaTest
// @AutoConfigureTestDatabase(replace = Replace.NONE)
// @Rollback(false)
// public class UserRepositoryTest {

//     @Autowired
//     private  UserRepository repo;

//     @Autowired
//     private TestEntityManager entityManager;

//     @Test
//     public void testCreateUser(){
//       EntityClass user = new EntityClass();
//         user.setFirstName("Tebu");
//         user.setLastName("Ntabane");
//         user.setEmail("entabane@gmail.com");
//         user.setPassword("password@2024");
//         user.setConfirmPassword("password@2024");

//        EntityClass savedUser =  repo.save(user);
//       EntityClass existUser =  entityManager.find(EntityClass.class, savedUser.getId());
//         assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
      
//     }
// }
