package com.example.demo.Repons;

import com.example.demo.domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PersonReponsitoryTests {

    @Autowired
    private PersonReponsitory personReponsitory;
    private Long id;

    @BeforeEach
    public void testSave(){
        assertNotNull(personReponsitory);
        Person person = new Person("whw", 23);
        Person savedPerson = personReponsitory.saveAndFlush(person);
        id = savedPerson.getId();
    }

    @Test
    public void testFindById(){
        Optional<Person> op = personReponsitory.findById(id);
        assertTrue(op.isPresent());
        assertEquals("whw", op.get().getName());
        assertEquals(Integer.valueOf(23), op.get().getAge());

    }

    @Test
    public void testDeleteById(){
        personReponsitory.deleteById(id);
    }

    @Test
    public void testFindPersonNameById(){
        String name = personReponsitory.findPersonNameById(id);
        System.out.println(name);
        assertEquals("whw", name);
    }
}
