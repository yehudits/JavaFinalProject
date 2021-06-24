package Pages.ManagedBeans;


import DataLayer.User;
import Enums.LoginType;
import Enums.UserType;
import LoginProcess.LoginProcess;
import java.io.Serializable;
import javax.enterprise.context.*;

import javax.inject.Named; 

@Named("loginBean")
@SessionScoped
public class LoginBean implements Serializable{
    
    public String yyy(){
        System.out.println("dddd");
        return "5";
    }

    public LoginBean(){
        this.loginProcess = new LoginProcess();
    }

    //services
    LoginProcess loginProcess;


    //properties connected to the ui
    private int id;
    private String name;
    private UserType userType;
    private String password;
    private String email= " hhhhh    ";
    private LoginType loginType;

    public void onSubmit(){
        if (loginType ==LoginType.SIGNIN){
            loginProcess.signIn(new User());
        }
        else if (loginType == LoginType.SINGUP){
            loginProcess.signUp(new User());
        }
    }


    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }


}
