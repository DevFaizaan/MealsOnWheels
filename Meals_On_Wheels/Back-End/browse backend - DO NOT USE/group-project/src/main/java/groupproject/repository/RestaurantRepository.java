package groupproject.groupproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import groupproject.groupproject.model.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

}
