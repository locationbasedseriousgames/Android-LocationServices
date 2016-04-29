package com.locationbasedseriousgames.android.locationservices;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	// Acquire a reference to the system Location Manager
 	LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        // Define a listener that responds to location updates
     	LocationListener locationListener = new LocationListener() {
     		
     		@Override
     	    public void onLocationChanged(Location location) {
     	      // Called when a new location is found by the network location provider.
     	      // makeUseOfNewLocation(location);
     	    }

     		@Override
     	    public void onStatusChanged(String provider, int status, Bundle extras) {
     	    	
     	    }

     		@Override
     	    public void onProviderEnabled(String provider) {
     	    	
     	    }

     		@Override
     	    public void onProviderDisabled(String provider) {
     	    	
     	    }
     	};
     	
        // Register the listener with the Location Manager to receive location updates
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
}