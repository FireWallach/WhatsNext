/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.util.ArrayList;
import whatsnext.User;
import whatsnext.LoginUI;


/**
 *
 * @author daw5510
 */
public class LoginController {
    private ArrayList<User> userList = new ArrayList<User>(); 
    private LoginUI lui = new LoginUI(); 
    
    public LoginController(){
        userList.add(new User("admin", "password"));
        userList.add(new User("rabbits04", "angry"));
        lui.setVisible(true);
        
    }
    
    
}
