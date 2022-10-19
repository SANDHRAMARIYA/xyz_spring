package com.nestdigital.xyzbackend.Dao;

import com.nestdigital.xyzbackend.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
