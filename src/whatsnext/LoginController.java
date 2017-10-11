/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
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
        
        class ButtonListener implements ActionListener{
        
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                System.out.println(authenticate());
            }
        }
        lui.addButtonListener(new ButtonListener());
        
    }
    
    public Boolean authenticate(){
        for(int i = 0; i < userList.size(); i++){
            if((userList.get(i).getUsername().equals(lui.getjTextField1().getText()))&&userList.get(i).getPassword().equals(lui.getjPasswordField2().getPassword())){
                return true;
            }
        }
        System.out.println("Username: " + lui.getjTextField1().getText() + "\nPassword: " + lui.getjPasswordField2().getPassword());
        return false;
    }
    
    
}
