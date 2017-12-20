/*
 * Copyright (c) Team Extreme. All rights reserved.
 * Technologies  * 
 * Language - JAVA  * 
 * Database - MySQL  * 
 */
package school_management;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author wickr
 */
public class School_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login_UI login = new Login_UI();
        login.setVisible(true);
    }
    
}
