package entitles;

import java.util.ArrayList;
import java.util.List;

public class Salas {
   
    private String school;
    private Student student;
    
    private List<NewSalas> salas = new ArrayList<>();
    
    public Salas(){
    }
    public Salas(String school,List<NewSalas> salas, Student student){
        this.school = school;
        this.salas = salas;
        this.student = student;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public void add(NewSalas sala){
        salas.add(sala);
    }
    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
		sb.append("School: ");
		sb.append(school).append("\n");
		sb.append("Sala: ");
		sb.append(salas).append("\n");
		sb.append("New equipments:\n");
		for(NewSalas sl : salas) {
			sb.append(sl).append("\n");
		}
		return sb.toString();
    }
}
