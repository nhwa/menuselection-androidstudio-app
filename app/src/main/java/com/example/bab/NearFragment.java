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
                .title("꽁양꽁양")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460618, 126.561094))
                .title("콘킹부대찌개")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460329, 126.561558))
                .title("밥먹젠")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460364, 126.562135))
                .title("학교종이땡땡땡")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460650, 126.561865))
                .title("상아탑식당")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460403, 126.562335))
                .title("깨수깡해장국")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449501, 126.558206))
                .title("배꼽시계")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f)); googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450338, 126.559171))
                .title("종합강의실")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f)); googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460607, 126.561395))
                .title("삐삐네정식")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450102, 126.558527))
                .title("산아름국수")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460237, 126.560968))
                .title("김밥천국제주대점")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460645, 126.561545))
                .title("봉구스밥버거")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460680, 126.561863))
                .title("신전떡볶이")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.459148, 126.557987))
                .title("이삭토스트")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450106, 126.559241))
                .title("제대김밥")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449860, 126.557637))
                .title("매력식당")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460722, 126.561080))
                .title("아우라키친")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460334, 126.561769))
                .title("오니기리와이규동")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.456824, 126.559689))
                .title("세이슌")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460304, 126.562043))
                .title("써브웨이")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460397, 126.562290))
                .title("도스마스")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.448287, 126.558896))
                .title("올드소울")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460340, 126.561739))
                .title("진성반점")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450151, 126.558444))
                .title("신룽푸마라탕")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449802, 126.558449))
                .title("짬스뽕스")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450215, 126.559045))
                .title("백일흑야")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.449030, 126.558832))
                .title("아라주는엄마치킨")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.448902, 126.559116))
                .title("푸라닭")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450333, 126.558449))
                .title("멕시카나치킨")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.450524, 126.558338))
                .title("토마토도시락")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460337, 126.561542))
                .title("한솥도시락")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460321, 126.561492))
                .title("토니버거")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.460386, 126.562385))
                .title("맘스터치")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
                .alpha(0.9f));
    }
}

