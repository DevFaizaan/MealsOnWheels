package groupproject.groupproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import groupproject.groupproject.model.PastOrder;

@Repository
public interface PastOrderRepository extends JpaRepository<PastOrder,Long> {

}
