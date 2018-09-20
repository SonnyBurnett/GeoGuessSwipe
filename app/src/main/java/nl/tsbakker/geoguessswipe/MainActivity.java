package nl.tsbakker.geoguessswipe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

//
// Name:    MainActivity
// Purpose: Main program of Geo Guess Swipe app
// Author:  Taco Bakker
// Date:    16-9-2018
//

public class MainActivity extends AppCompatActivity {


    //
    // Note a RecyclerView is a view that is used when a lot of data needs to be displayed
    // that will likely not fit the screen
    // And you can have a list with more complex elements
    // An excellent article can be found here: https://medium.com/@thomassimonini/recyclerview-made-easy-16bf2e261694
    //

    public RecyclerView recyclerView;
    public GeoObjectAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate our data
        final List<GeoObject> mGeoObjects = new ArrayList<>();
        for (int i = 0; i < GeoObject.PRE_DEFINED_GEO_OBJECT_NAMES.length; i++) {
            mGeoObjects.add(new GeoObject(GeoObject.PRE_DEFINED_GEO_OBJECT_NAMES[i],
                    GeoObject.PRE_DEFINED_GEO_OBJECT_IMAGE_IDS[i],
                    GeoObject.PRE_DEFINED_GEO_OBJECT_INEUROPE[i]));

        }  // end of for statement


        // Bind the recyclerview to the recycle_id in the layout
        recyclerView = findViewById(R.id.recycle_id);


        // instantiate an adapter and connect it to our recyclerview
        mAdapter = new GeoObjectAdapter(this, mGeoObjects);
        recyclerView.setAdapter(mAdapter);

        // Layoutmanager: Tells the RecyclerView how to layout all those views

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);






    }  // end of onCreate method



}  // end of class
