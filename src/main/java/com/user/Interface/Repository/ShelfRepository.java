package com.user.Interface.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Interface.Entity.shelf;

public interface ShelfRepository extends JpaRepository<shelf, Integer> {

	List<shelf> findByPARENTIDIs(int nodeId);

}
