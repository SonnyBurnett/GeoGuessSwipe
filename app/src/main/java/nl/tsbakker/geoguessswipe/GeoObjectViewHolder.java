package nl.tsbakker.geoguessswipe;

//
// Name:    GeoObjectViewHolder
// Purpose: Handle the viewholder, which means translate the layout of the object in the Contentview to the Recycleview
//          It is the very object that represents each item in our collection and will be used to display it.
//          In other words: Used to provide the RecyclerView with new views when needed.
//          For example when scrolling
// Author:  Taco Bakker
// Date:    16-9-2018
//

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class GeoObjectViewHolder extends RecyclerView.ViewHolder {


    public ImageView geoImage;
    public View view;

    public GeoObjectViewHolder(View itemView) {
        super(itemView);
        geoImage = itemView.findViewById(R.id.geo_image_view);
        view = itemView;
    }

}
