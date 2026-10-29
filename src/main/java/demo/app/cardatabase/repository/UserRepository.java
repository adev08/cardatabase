package demo.app.cardatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.app.cardatabase.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
