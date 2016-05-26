package com.degiorgi.valerio.customadapaterpicassogridview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Valerio on 26/05/2016.
 */
public class MainGridAdapter extends ArrayAdapter<mObject> {

  Context mContext;
  ArrayList<mObject> mArray = new ArrayList<>();

  public MainGridAdapter(Context context,ArrayList<mObject> objects) {
    super(context,R.layout.single_gridview_item,objects);

   this.mContext = context;
    this.mArray = objects;

  }

  public class ViewHolder {

    TextView mText;
    ImageView mImage;

  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {

    ViewHolder holder;

    mObject object = mArray.get(position);


    if (convertView == null) {
      LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      convertView = inflater.inflate(R.layout.single_gridview_item, parent,false);
      holder = new ViewHolder();
      holder.mText = (TextView) convertView.findViewById(R.id.grid_text);
      holder.mImage = (ImageView) convertView.findViewById(R.id.grid_image);
      convertView.setTag(holder);
    }else
    {holder = (ViewHolder) convertView.getTag();}

    holder.mText.setText(object.getCatDescription());
    Picasso.with(mContext).load(object.getCatUrl()).fit().into(holder.mImage);


    Log.w("TEST1" , "adapter " + object.getCatUrl());


    return convertView;

  }
}
