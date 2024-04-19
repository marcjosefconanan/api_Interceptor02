package api_Interceptor02.api_Interceptor02.Repositories;


import api_Interceptor02.api_Interceptor02.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
}