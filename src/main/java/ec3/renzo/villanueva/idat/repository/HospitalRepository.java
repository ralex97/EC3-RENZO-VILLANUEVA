package ec3.renzo.villanueva.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec3.renzo.villanueva.idat.models.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
  
}
