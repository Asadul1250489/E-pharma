/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asad;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author java2
 */
@ManagedBean(name="registrationBean")
@RequestScoped
public class RegistrationBean {
     private RegistrationForm registrationForm = null;
 
 private List<String> genders = null;
 
 public RegistrationBean()
 {

  
  this.genders = new ArrayList<>();
  this.genders.add("Male");
  this.genders.add("Female");
 
 }
 
 public String register()
 {
  System.out.println("register.....");
  //store data in DB
  System.out.println(this.registrationForm);
  return "welcome";//go to welcome.xhtml
 }
 
 public RegistrationForm getRegistrationForm()
 {
  if(this.registrationForm == null){
   this.registrationForm = new RegistrationForm();
  }
  return registrationForm;
 }

 public void setRegistrationForm(RegistrationForm registrationForm)
 {
  this.registrationForm = registrationForm;
 }



 

 public List<String> getGenders()
 {
  return genders;
 }

 public void setGenders(List<String> genders)
 {
  this.genders = genders;
 }
}
