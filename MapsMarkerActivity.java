package com.example.mapwithmarker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
public class MapsMarkerActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        final LatLng departure = new LatLng(-32.852, 151.211);
        final LatLng destination = new LatLng(-33.852, 151.211);
        //Marker1
        final MarkerOptions m1 = new MarkerOptions();
        m1.position(departure);
        m1.title("Departure Marker");
        m1.draggable(true);
        //Marker2
        final MarkerOptions m2 = new MarkerOptions();
        m2.position(destination);
        m2.title("Destination Marker");
        m2.draggable(true);
        //Add Markers to Map
        googleMap.addMarker(m1);
        googleMap.addMarker(m2);
        //Move Camera
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(departure));

        //PolylineOptions polyline1 = new PolylineOptions().clickable(false).add(departure, destination);
        //googleMap.addPolyline(polyline1);
        //LatLngBounds ADELAIDE = new LatLngBounds(new LatLng(-35.0, 138.58), new LatLng(-34.9, 138.61));
        //googleMap.setLatLngBoundsForCameraTarget(ADELAIDE);

        Button next = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LatLng x1 = m1.getPosition();
                LatLng x2 = m2.getPosition();
                PolylineOptions polyline1 = new PolylineOptions().clickable(false).add(x1,x2);
                googleMap.addPolyline(polyline1);
            }

        });
    }
}
