/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitri.db;

import java.sql.Connection;



/**
 *
 * @author USER
 */
public class DbHelper {
    private static Connection connection;
    
    public static Connection getConnection(){
        if(connection==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdc:mysql//localhostpot/pbo_2211082036");
            
        }
        
    }
}
