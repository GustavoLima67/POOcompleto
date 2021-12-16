package entitles;

import java.util.Date;

public class Salas {
   
    private String school;
    private String clas;
    private Date year;
    
    public Salas(){
    }
    public Salas(String school,String clas,Date year){
        this.school = school;
        this.clas = clas;
        this.year = year;
    }
    public Salas(String school,String clas){
        this.school = school;
        this.clas = clas;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getClas(){
        return clas;
    }
    public void setClas(String clas){
        this.clas = clas;
    }
    public Date getYear(){
        return year;
    }
    public void setYear(Date year){
        this.year = year;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
		sb.append("School: ");
		sb.append(school).append("\n");
		sb.append("Clas: ");
		sb.append(clas).append("\n");
                sb.append("Current year: ");
                sb.append(year).append("\n");
		return sb.toString();
    }
}
