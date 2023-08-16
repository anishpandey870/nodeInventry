package com.user.Interface.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Interface.Entity.login;

public interface LoginRepository extends JpaRepository<login, Integer> {

	login findByUsernameAndPassword(String uname, String pass);

}
