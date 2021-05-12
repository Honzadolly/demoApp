package cz.vse.java.demoApp.repository;

import cz.vse.java.demoApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
