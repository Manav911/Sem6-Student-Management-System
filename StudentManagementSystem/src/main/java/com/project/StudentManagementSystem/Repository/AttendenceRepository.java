package com.project.StudentManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Attendence;

@Repository
public interface AttendenceRepository extends JpaRepository<Attendence, Integer>
{

	@Query(value = "select * from attendence where student_studentid = :id and attendence = 'present' and date between :startdate and :enddate", nativeQuery = true)
	List<Attendence> getAllPresent(@Param("id")int studentid,@Param("startdate")String startdate,@Param("enddate") String enddate);

	@Query(value = "select * from attendence where student_studentid = :id and attendence = 'absent' and date between :startdate and :enddate", nativeQuery = true)
	List<Attendence> getAllAbsent(@Param("id")int studentid,@Param("startdate")String startdate,@Param("enddate") String enddate);

}
