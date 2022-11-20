package com.javatechie.repository;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.javatechie.entity.Appuser;

/**
 * Spring Data JPA repository for the Appuser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AppuserRepository extends JpaRepository<Appuser, Long>, JpaSpecificationExecutor<Appuser> {}

