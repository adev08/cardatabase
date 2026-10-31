package demo.app.cardatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.app.cardatabase.entity.CarOwner;

public interface CarOwnerRepository
extends JpaRepository<CarOwner, Long> {
}
