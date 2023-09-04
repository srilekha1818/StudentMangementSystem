package com.student.manage.service;

import java.time.LocalDate;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.tomcat.util.http.parser.MediaTypeCache;

import com.student.manage.entity.Student;

import jakarta.websocket.server.PathParam;

import javax.ws.rs.core.MediaType;
//@Consumes("application/xml,application/json")
//@Produces("application/xml,application/json")
@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
@Path("/studentservice")
public interface StudentService  {
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	/*@Path("/patients/{id}")
	@GET
	Patient getPatient(@PathParam("id") Long id);	*/
	@Path("/edit/{id}")
	@GET
	Student getStudentById(@PathParam("id")Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	Integer calculateAge(LocalDate dob);
	

}
