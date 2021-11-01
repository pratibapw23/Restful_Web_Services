package springBootStarter.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServices {
	
	private List<Student> students=new ArrayList<>(Arrays.asList(
				new Student("101","ABC",1,"pune"),
				new Student("102","PQR",2,"Mumbai"),
				new Student("103","XYZ",3,"Nagpur")
			
			));

	public List<Student> getAllStudents()
	{
		return students;
	}
	public Student getStudent(String id)
	{
		return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addStudent(Student student)
	{
		students.add(student);
	}
}
