package entitles;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Salas {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date year;
    private String school;
    private NewSalas newSalas;
    
    private List<NewSalas> salas = new ArrayList<>();
    
    public Salas(){
    }
    public Salas(String school,List<NewSalas> salas,Date year,NewSalas newSalas){
        this.school = school;
        this.salas = salas;
        this.year = year;
        this.newSalas = newSalas;
    }
    public Date getYear(){
        return year;
    }
    public void setYear(Date year){
        this.year = year;
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
    public NewSalas getNewSalas(){
        return newSalas;
    }
    public void setNewSalas(NewSalas newSalas){
        this.newSalas = newSalas;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Year: ");
        sb.append(sdf.format(year)).append("\n");
        sb.append("School: ");
        sb.append(school).append("\n");
        sb.append("New equipments: ");
        sb.append(newSalas);
        return sb.toString();
    }
}
