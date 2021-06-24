
import javax.enterprise.context.SessionScoped;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
@SessionScoped
public class LoginBean {
    public String email ="ddd";
    
    public String getEmail(){
        return this.email;
    }
}
