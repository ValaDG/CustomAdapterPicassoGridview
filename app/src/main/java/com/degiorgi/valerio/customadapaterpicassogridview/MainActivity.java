package com.degiorgi.valerio.customadapaterpicassogridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  GridView mGrid;
  MainGridAdapter mAdapter;
  ArrayList<mObject> mArray = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);



    mGrid = (GridView) findViewById(R.id.main_gridview);

    addElementsToArray();

    mAdapter = new MainGridAdapter(getApplicationContext(),mArray);
    mGrid.setAdapter(mAdapter);


  }

  public void addElementsToArray() {
    mArray.clear();
    mArray.add(new mObject("Cute Kitty", "http://www.wallhd4.com/wp-content/uploads/2016/03/cute-kitty-37.jpeg"));
    mArray.add(new mObject("Cute",
        "http://deskbg.com/s3/wpp/18/18180/sad-cute-kitty-desktop-background.jpg"));
    mArray.add(new mObject("Aw",
        "http://www.petsftw.com/wp-content/uploads/2016/03/cutecat.jpg"));
    mArray.add(new mObject("hawt",
        "https://s-media-cache-ak0.pinimg.com/736x/f0/26/05/f0260599e1251c67eefca31c02a19a81.jpg"));
    mArray.add(new mObject(":o",
        "http://www.borongaja.com/data_images/out/7/600947-cute-cat.jpg"));
    mArray.add(new mObject(":3",
        "http://cdn.cutestpaw.com/wp-content/uploads/2013/01/l-Heres-a-cute-cat-for-you.jpg"));

  }
}
