package entitles;

public class Salas {
   
    private String school;
    private String clas;
    
    public Salas(){
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
    @Override
    public String toString(){
        return "School: "+school+", Class: "+clas;
    }
}
