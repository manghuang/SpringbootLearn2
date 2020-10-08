package com.example.demo.Repons;

import com.example.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonReponsitory extends JpaRepository<Person, Long> {

    @Query("select name from Person where id =  id")
    String findPersonNameById(@Param("id") Long id);
}
