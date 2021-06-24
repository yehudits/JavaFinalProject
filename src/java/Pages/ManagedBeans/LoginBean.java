package Pages.ManagedBeans;


import DataLayer.User;
import Enums.LoginType;
import Enums.UserType;
import LoginProcess.LoginProcess;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {

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
    private String email;
    private LoginType loginType;

    public void onSubmit(){
        if (loginType ==LoginType.SIGNIN){
            loginProcess.signIn(new User());
        }
        else if (loginType == LoginType.SINGUP){
            loginProcess.signUp(new User());
        }
    }




}
