package com.javatechie.service;

public class Filter<FIELD_TYPE> implements java.io.Serializable {
  
    private static final long serialVersionUID = 1L;
    
    private FIELD_TYPE equals;
    
    private FIELD_TYPE notEquals;
    
    private java.lang.Boolean specified;
    
    private java.util.List<FIELD_TYPE> in;
    
    private java.util.List<FIELD_TYPE> notIn;
    
    public Filter() {
    }
    
    public  Filter(com.javatechie.service.Filter<FIELD_TYPE> filter) {
    }
    
    public  com.javatechie.service.Filter<FIELD_TYPE> copy() {
      return null;
    }
    
    public  FIELD_TYPE getEquals() {
      return null;
    }
    
    public  com.javatechie.service.Filter<FIELD_TYPE> setEquals(FIELD_TYPE equals) {
      return null;
    }
    
    public  FIELD_TYPE getNotEquals() {
      return null;
    }
    
    public  com.javatechie.service.Filter<FIELD_TYPE> setNotEquals(FIELD_TYPE notEquals) {
      return null;
    }
    
    public java.lang.Boolean getSpecified() {
      return null;
    }
    
    public  com.javatechie.service.Filter<FIELD_TYPE> setSpecified(java.lang.Boolean specified) {
      return null;
    }
    
    public  java.util.List<FIELD_TYPE> getIn() {
      return null;
    }
    
    public  com.javatechie.service.Filter<FIELD_TYPE> setIn(java.util.List<FIELD_TYPE> in) {
      return null;
    }
    
    public  java.util.List<FIELD_TYPE> getNotIn() {
      return null;
    }
    
    public  com.javatechie.service.Filter<FIELD_TYPE> setNotIn(java.util.List<FIELD_TYPE> notIn) {
      return null;
    }
    
    public boolean equals(java.lang.Object o) {
      return false;
    }
    
    public int hashCode() {
      return 0;
    }
    
    public java.lang.String toString() {
      return null;
    }
    
    protected java.lang.String getFilterName() {
      return null;
    }
   


  }