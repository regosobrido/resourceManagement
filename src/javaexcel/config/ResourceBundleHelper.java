/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexcel.config;

import java.util.ResourceBundle;

/**
 *
 * @author REGO
 */
public class ResourceBundleHelper {
    
    public ResourceBundle dameRecursosDatabase(){
        return ResourceBundle.getBundle("javaexcel.config.DBConexion");
    }
    
    public ResourceBundle dameRecursosUIComponents(){
        return ResourceBundle.getBundle("javaexcel.config.UIComponents");
    }   
    
}
