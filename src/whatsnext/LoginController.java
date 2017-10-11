/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
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
                if(authenticate()){
                    NavController nc = new NavController();
                }
            }
        }
        lui.addButtonListener(new ButtonListener());
        
    }
    
    public Boolean authenticate(){
        for(int i = 0; i < userList.size(); i++){
            if((userList.get(i).getUsername().equals(lui.getjTextField1().getText()))&&(Arrays.equals(lui.getjPasswordField2().getPassword(), userList.get(i).getPassword().toCharArray()))){
                return true;
            }
        }
        lui.getjLabel3().setText("Incorrect Username or Password");
        return false;
    }
    
    
}
