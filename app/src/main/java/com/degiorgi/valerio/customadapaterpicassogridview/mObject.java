package com.degiorgi.valerio.customadapaterpicassogridview;

/**
 * Created by Valerio on 26/05/2016.
 */
public class mObject {

  String catDescription;
  String catUrl;




  public mObject(String cat_description, String cat_url){

   catDescription=  cat_description;
    catUrl = cat_url;

  }


  public String getCatDescription() {
    return catDescription;
  }

  public void setCatDescription(String catDescription) {
    this.catDescription = catDescription;
  }

  public String getCatUrl() {
    return catUrl;
  }

  public void setCatUrl(String catUrl) {
    this.catUrl = catUrl;
  }
}
