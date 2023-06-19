package com.example.exam_44_calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathService {
    @Autowired
    public MathRepo repo;
    public List<Entity_Math> listAll(){return repo.findAll();}


    public void save(Entity_Math entityMath){repo.save(entityMath); }
}
