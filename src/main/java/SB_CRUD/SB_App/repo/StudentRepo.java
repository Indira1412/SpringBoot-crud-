package SB_CRUD.SB_App.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import SB_CRUD.SB_App.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Long>{

}
