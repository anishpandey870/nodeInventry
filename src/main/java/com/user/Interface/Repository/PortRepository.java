package com.user.Interface.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Interface.Entity.port;

public interface PortRepository extends JpaRepository<port, Integer> {

	List<port> findByPARENTIDIs(int parseInt);

}
