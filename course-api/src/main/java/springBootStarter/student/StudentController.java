package springBootStarter.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	
	@Autowired
	private StudentServices studentservices;
	
	@RequestMapping("/students")
		public List<Student> getAllStudents()
		{
			return studentservices.getAllStudents();
		}
	
	@RequestMapping("/students/{studentid}")
	public Student getStudent(@PathVariable String studentid)
	{
		return studentservices.getStudent(studentid);
	}
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addTopic(@RequestBody Student students)
	{
		studentservices.addStudent(students);
	}
}
