package com.example.bab;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class NearFragment extends Fragment implements OnMapReadyCallback {
    View rootView;
    MapView mapView;
    public NearFragment() {
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_near, container, false);
        mapView = (MapView) rootView.findViewById(R.id.mapview);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
        return rootView;
    }
    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(this.getActivity());
        // Updates the location and zoom of the MapView
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(33.454671, 126.561275), 15);
        googleMap.animateCamera(cameraUpdate);
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449109, 126.559327))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460618, 126.561094))
                .title("??????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460329, 126.561558))
                .title("?????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460364, 126.562135))
                .title("?????????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460650, 126.561865))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460403, 126.562335))
                .title("??????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449501, 126.558206))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f)); googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450338, 126.559171))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f)); googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460607, 126.561395))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450102, 126.558527))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460237, 126.560968))
                .title("????????????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460645, 126.561545))
                .title("??????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460680, 126.561863))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.459148, 126.557987))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450106, 126.559241))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449860, 126.557637))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460722, 126.561080))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460334, 126.561769))
                .title("????????????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.456824, 126.559689))
                .title("?????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460304, 126.562043))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460397, 126.562290))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.448287, 126.558896))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460340, 126.561739))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450151, 126.558444))
                .title("??????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449802, 126.558449))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450215, 126.559045))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449030, 126.558832))
                .title("????????????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.448902, 126.559116))
                .title("?????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450333, 126.558449))
                .title("??????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450524, 126.558338))
                .title("??????????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460337, 126.561542))
                .title("???????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460321, 126.561492))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460386, 126.562385))
                .title("????????????")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
    }
}

