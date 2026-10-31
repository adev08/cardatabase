package demo.app.cardatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.app.cardatabase.entity.Owner;


public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
