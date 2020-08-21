package com.javatechie.docker_jenkins_integration_sample;


import java.util.Vector;
import java.util.Enumeration;

public class Test {
    Vector v = new Vector();
    String submit = null;
    String item = null;
   
    private void addItem(String name) {
    v.addElement(name);
    }

    private void removeItem(String name) {
    v.removeElement(name);
    }

    public void setItem(String name) {
    item = name;
    }
   
    public void setSubmit(String s) {
    submit = s;
    }

    public String[] getItems() {
    String[] s = new String[ v.size()];
    v.copyInto(s);
    return s;
    }
   
 

    // reset
    private void reset() {
    submit = null;
    item = null;
    }
}

