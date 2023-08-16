package com.user.Interface.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.user.Interface.Entity.node;

public interface NodeRepository extends JpaRepository<node, Integer> {
	List<node> findByNAMEIs(String name);
	List<node> findByIPADDRESS1Is(String ip1);
	List<node> findByIPADDRESS2Is(String ip2);
	List<node> findByEMSIDIs(String EmsId);
	List<node> findByNETWORKNAMEIs(String NetworkName);
	
	@Query("select n from node n where IPADDRESS1=?1 or IPADDRESS2=?1")
	List<node> findByIPADDRESS(String ip);
	



}
