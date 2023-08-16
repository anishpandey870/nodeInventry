package com.user.Interface.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Interface.Entity.card;

public interface CardRepository extends JpaRepository<card, Integer> {

	List<card> findByPARENTIDIs(int parseInt);

}
