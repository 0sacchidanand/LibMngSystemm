package pkg_person;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;

public class StudentManager {
	ObjectOutputStream oos_student = null;
	ObjectInputStream ois_Student = null;
	
	File student_file= null;
	
	ArrayList<Student> student_list = null;
	
	public StudentManager() {
		student_file=new File("Student.dat");
		student_list = new ArrayList<Student>();
		
		
		if (student_file.exists()) {
			try {
				ois_Student = new ObjectInputStream(new FileInputStream(student_file));
				student_list =(ArrayList<Student>) ois_Student.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	public void addAStudent(Student student) {
		student_list.add(student);
	}
	public Student get(int rollNo) {
		for (Student student:student_list) {
			if (student.getRollNo()==rollNo)
				return student;
		}
		return null;
	}
	public void viewAllStudent() {
		for (Student student:student_list)
			System.out.println(student);
	}
	public boolean deleteStudent(int delete_rollNo) {
		ListIterator<Student> student_iterator = (ListIterator<Student>) student_list.iterator();
		while (student_iterator.hasNext()) {
			Student student = student_iterator.next();
			if (student.getRollNo() == delete_rollNo) {
				student_list.remove(student);
				return true;
			}
		}
		return false;
	}
}
