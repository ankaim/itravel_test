package de.restservice.itravel;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothingRepository extends JpaRepository<Clothing, Integer> {

    @Query(value = "select * from clothing;", nativeQuery = true)
    List<?> allPrint();
}
