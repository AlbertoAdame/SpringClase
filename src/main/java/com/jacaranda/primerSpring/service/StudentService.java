package com.jacaranda.primerSpring.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jacaranda.primerSpring.model.Student;

@Service
public class StudentService {
	private List<Student> lista;
	
	public StudentService() {
		lista = new ArrayList<Student>();
		lista.add(new Student("Inma", "Olias",25));
		lista.add(new Student("Pepe", "Perez",18));
		lista.add(new Student("Juan", "Garcia",50));
		lista.add(new Student("Marta", "Perea",87));
	}

	public List<Student> getStudents() {
		return lista;
	}
	
	public boolean add(Student e) {
		return lista.add(e);
	}

	public boolean remove(Student o) {
		return lista.remove(o);
	}

	public Student get(int index) {
		return lista.get(index);
	}
	
	public Student getStudent(String nombre, String apellido) {
		
		Boolean encontrado = false;
		Student resultado=null;
		
		Iterator<Student>iterator = this.lista.iterator();
		while(iterator.hasNext()&& !encontrado) {
			resultado=iterator.next();
			if(resultado.getName().equals(nombre) && resultado.getSurname().equals(apellido)) {
				encontrado=true;
			}
		}
		
		if(encontrado ==true) 
			return resultado;
		else
			return null;
	}
	
public Boolean updateStudent(String nombre, String apellido, int edad) {
		
		Boolean encontrado = false;
		Student resultado=null;
		
		Iterator<Student>iterator = this.lista.iterator();
		while(iterator.hasNext()&& !encontrado) {
			resultado=iterator.next();
			if(resultado.getName().equals(nombre) && resultado.getSurname().equals(apellido)) {
				resultado.setAge(edad);
				encontrado=true;
			}
		}
		
			return encontrado;
	}


	
	
}
