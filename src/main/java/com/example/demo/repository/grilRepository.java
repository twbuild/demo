package com.example.demo.repository;

import com.example.demo.domain.grilDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface grilRepository extends JpaRepository<grilDomain,Integer> {
    //通过年龄来检查
    public List<grilDomain> findAllByAge(Integer age);
    public void deleteById(Integer id);
}
