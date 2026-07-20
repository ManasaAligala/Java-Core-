import java.util.Scanner;
public class Hospital {
    private int patientId;
    private String patientName;
    private int age;
    private String disease;
    private String doctorName;
    
    
    public void setpatientId(int patientId){
        if(patientId>0){
        this.patientId = patientId;
        }else{
            System.out.println("Id must be greater than zero. Invalid patientId");
        }

    }
    public void setpatientName(String patientName){
        if(patientName.isEmpty()){
            System.out.println("Name cannot be empty");
        }else{
             this.patientName= patientName;
        }
       

    }
    
    public void setAge(int age){
        if(age<=1 && age>=120){
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }
        

    }
    public void setDisease(String disease){
        if(disease.equalsIgnoreCase("Fever")){
                this.disease= "Fever";
        }
        else if(disease.equalsIgnoreCase("Diabetes")){
                this.disease= "Asthma";
        }
        else if(disease.equalsIgnoreCase("Heart Disease")){
                this.disease= "Heart Disease";
;
        }
        else if(disease.equalsIgnoreCase("Asthma")){
                this.disease= "Diabetes";
        }else{
            System.out.println("Invalid Disease");
        }
        

    }
    public void setdoctorName(String doctorName){
        if(doctorName.isEmpty()){
            System.out.println("Name cant be empty");
        }else{
            this.doctorName = doctorName;
        }
        

    }

    public int getpatientId(){
        return patientId;
    }
    public String getpatientName(){
        return patientName;
    }

    public int getAge(){
        return age;
    }

    public String getDisease(){
        return disease;
    }

    public String getdoctorName(){
        return doctorName;
    }
    void displayPatient(){
        System.out.print("Enter patient Id: "+getpatientName());
        System.out.print("Enter Patient name: "+getpatientName());
         System.out.print("enter patient age: "+getAge());
          System.out.print("Disease: "+getDisease());
            System.out.print("Doc name: "+getdoctorName());
        
    }

    


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Hospital h = new Hospital();
        System.out.print("Enter patient Id: ");
        h.setpatientId(sc.nextInt());
        sc.nextLine();
         System.out.print("Enter Patient name: ");
         h.setpatientName(sc.nextLine());
          System.out.print("enter patient age: ");
          h.setAge(sc.nextInt());
          sc.nextLine();
           System.out.print("Disease: ");
           h.setDisease(sc.nextLine());
           sc.nextLine();
            System.out.print("Doc name: ");
            h.setdoctorName(sc.nextLine());
            h.displayPatient();
    }
}
