package com.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection {
    private List<String> addressList;
	private Set<String> addressSet;
	private Map<Integer,String> addressMap;
	private Properties addressProp;
    

 
   public void setAddressList(List<String> addressList) {
      this.addressList = addressList;
   }
   

   public List<String>  getAddressList() {
      System.out.println("List Elements :"  + addressList);
      return addressList;
   }
   
   
   public void setAddressSet(Set<String>  addressSet) {
      this.addressSet = addressSet;
   }

   public Set <String>  getAddressSet() {
      System.out.println("Set Elements :"  + addressSet);
      return addressSet;
   }
   

   public void setAddressMap(Map <Integer,String>  addressMap) {
      this.addressMap = addressMap;
   }
   
   
   public Map <Integer,String> getAddressMap() {
      System.out.println("Map Elements :"  + addressMap);
      return addressMap;
   }
   
  
   public void setAddressProp(Properties addressProp) {
      this.addressProp = addressProp;
   }
   
  
   public Properties getAddressProp() {
      System.out.println("Property Elements :"  + addressProp);
      return addressProp;
   }
}