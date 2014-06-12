/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexcel.beans;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author REGO
 */
public class CustomerBean {
    
    private String dni;
    private String name;
    private String surname;
    private int telephone1;
    private int telephone2;
    private int numCard;
    private int account;
    private Image foto;
    private String address;
    private String mail;
    private int language;
    private int tipoCliente;    
    private String city;
    private int codPostal;
    private Date fechaAlta;
    private int opcionContacto;
    private int payOption;

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    private Date fechaBaja;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
    * opcion contacto
    * 1 telefono
    *  2 mail
    *  3 postal
    * 
    * language
    *  1 Español
    *  2 Inglés
    *  3 Galego
    * 
    *  tipo cliente
    * 
    *  1 Oro
    *  2 Plata
    *  3 Bronce
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTelephone() {
        return telephone1;
    }

    public void setTelephone(int telephone) {
        this.telephone1 = telephone;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int NumCard) {
        this.numCard = NumCard;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getOpcionContacto() {
        return opcionContacto;
    }

    public void setOpcionContacto(int opcionContacto) {
        this.opcionContacto = opcionContacto;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }
}
