package com.relation.repo;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.model.Belongings;

public interface BelongingsRepo extends JpaRepository<Belongings, Integer> {

}
