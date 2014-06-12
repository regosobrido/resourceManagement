/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcel.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import javaexcel.config.ResourceBundleHelper;

/**
 *
 * @author REGO
 */
public abstract class DatabaseConnectionHelper {

    public enum Entorno {

        DESARROLLO, PRODUCCIÓN
    }

    private static Connection conexion;
    private static Entorno entorno;
    private static ResourceBundleHelper oResourceBundleHelper;

    public DatabaseConnectionHelper() {
        getServidorMySQLOn();

    }

    private void getServidorMySQLOn() {
        String hostname = "";
        try {
            String comando = "hostname";
            Process hijo = Runtime.getRuntime().exec(comando);

            java.io.InputStream in = hijo.getInputStream();

            hostname = "";
            int i;
            while ((i = in.read()) != -1) {
                hostname += (char) i;
            }

            in.close();
            hijo.destroy();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //TODO: Averiguar el entorno desde el hostname
        //entorno=Entorno.DESARROLLO;        
    }

    private static ResourceBundle getRecursosDatabase() {
        oResourceBundleHelper = new ResourceBundleHelper();
        return oResourceBundleHelper.dameRecursosDatabase();

    }

    protected static Connection getConexion(String sUrl, String sDriver, String sUser, String sPass) {

        ResourceBundle oResourceBundle = getRecursosDatabase();

        Connection c = null;
        String url = oResourceBundle.getString("url");
        String driver = oResourceBundle.getString("driver"); //"com.mysql.jdbc.Driver";
        String user = oResourceBundle.getString("username"); //"username";
        String pass = oResourceBundle.getString("pass"); //"pass;"        

        try {
            Object newInstance = Class.forName(driver).newInstance();
            c = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {            
            System.err.println("Error:");
            e.printStackTrace();
        }

        if (c == null) {
            System.out.println("Can't get connection");
        }

        conexion=c;
        return conexion;     
    }
}
