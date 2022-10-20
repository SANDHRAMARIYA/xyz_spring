package com.nestdigital.xyzbackend.Dao;

import com.nestdigital.xyzbackend.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface StudentDao extends CrudRepository<StudentModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `students` WHERE `id`=:id",nativeQuery = true)
    void deleteStudentById(Integer id);
}
