package com.example.mini_Cimmute.question4.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//memory에 저장할꺼냐 mysql에 저장할꺼냐
public interface FruitRepository extends JpaRepository<Fruit, Long> {
    List<Fruit> findByName(String name);

    long countByName(String name);
    //JpaRepository<Entity객체, Entity의 id 타입>
    //JpaRepositoy를 상속 받는것만으로도 Bean으로 등록된다
}




