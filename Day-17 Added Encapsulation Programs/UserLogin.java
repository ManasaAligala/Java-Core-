import java.util.Scanner;
public class UserLogin {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String mobileNumber;
    private int loginAttempts=0;
    

    public void setuserId(int userId){
        if(userId>0){
            this.userId = userId;
        }


    }
    public int getuserId(){
        return  userId;
    }
    public void setname(String username){
        if(username.isEmpty()){
            System.out.println("User name cant be empty");
        }else{
            this.username = username;
        }

    }
    public String getname(){
        return  username;
    }
    public void setpassword(String password){
        if(password.length()>=8){
            this.password = password;
        }else{
            System.out.println("Password must contain at least 8 characters");
        }

    }
    
    public void setemail(String email){
       if(email.contains("@")){
           this.email = email;
       }

    }
    public String getemail(){
        return email;
    }
    public void setmobileNumber(String mobileNumber){
        if(mobileNumber.matches("\\d{10}")){
            this.mobileNumber = mobileNumber;
        }

    }
    public String getmobilenumber(){
        return mobileNumber;
    }
    public boolean login(String username, String password) {

    if (this.username.equals(username) && this.password.equals(password)) {
        System.out.println("Login Successful");
        loginAttempts = 0;
        return true;

    } else {
        loginAttempts++;

        if (loginAttempts >= 3) {
            System.out.println("Account Locked");
        } else {
            System.out.println("Invalid username or password");
            System.out.println("Attempts remaining: " + (3 - loginAttempts));
        }

        return false;
    }
}
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        UserLogin obj = new UserLogin();
        System.out.println("Enter UserId: ");
        obj.setuserId(sc.nextInt());
        sc.nextLine();
        
        System.out.println("Enter username: ");
        obj.setname(sc.nextLine());
        //sc.nextLine();
        System.out.println("Enter email: ");
        obj.setemail(sc.nextLine());
        //sc.nextLine();
        System.out.println("Enter mobile number: ");
        obj.setmobileNumber(sc.nextLine());
        //sc.nextLine();

        System.out.println("Enter password: ");
        obj.setpassword(sc.nextLine());

       
        for (int i = 1; i <= 3; i++) {

    System.out.print("Enter Login Username: ");
    String loginUsername = sc.nextLine();

    System.out.print("Enter Login Password: ");
    String loginPassword = sc.nextLine();

    if (obj.login(loginUsername, loginPassword)) {
        break;
    }
    }

    }
    
}
