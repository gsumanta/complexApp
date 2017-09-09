package net.sg.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sg.beans.Apartment;

public interface ApartmentRepo extends JpaRepository<Apartment, Long> {

}
