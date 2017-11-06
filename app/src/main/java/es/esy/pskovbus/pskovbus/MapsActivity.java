package es.esy.pskovbus.pskovbus;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

//import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList< String> geopoints=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent intent=getIntent();
        geopoints=intent.getStringArrayListExtra("geopoints");
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String label="";
int hue=0;



       for (int i=0; i<geopoints.size();i+=3){
           double pointX=Double.parseDouble(geopoints.get(i+1));
           double pointY=Double.parseDouble(geopoints.get(i+2));
            if (i>5){hue=200;};
           LatLng coord = new LatLng(pointX,pointY);
           label=""+geopoints.get(i);

                Marker point=mMap.addMarker(new MarkerOptions()
                 .position(coord)
                 .title(label)
                 .icon(BitmapDescriptorFactory.defaultMarker(hue)));

                    if(i==0){ point.showInfoWindow();}
       }



    }
}
