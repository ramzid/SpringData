/**
 * 
 */
package com.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.persistence.model.Employee;

/**
 * @author ramzi dridi
 *
 */

public interface IEmployeeDao extends CrudRepository<Employee, Integer> {


}
