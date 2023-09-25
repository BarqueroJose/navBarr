package com.example.navbarr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

   PrimerFragmento primerFragmento = new PrimerFragmento();
   SegundoFragmento segundoFragmento = new SegundoFragmento();
   TercerFragmento tercerFragmento = new TercerFragmento();
   CuartoFragmento cuartoFragmento = new CuartoFragmento();
   QuintoFragmento quintoFragmento = new QuintoFragmento();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment(primerFragmento);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int itemId = item.getItemId();
            if (itemId == R.id.primerFragmento) {
                loadFragment(primerFragmento);
                return true;
            } else if (itemId == R.id.segundoFragmento) {
                loadFragment(segundoFragmento);
                return true;
            } else if (itemId == R.id.tercerFragmento) {
                loadFragment(tercerFragmento);
                return true;
            } else if (itemId == R.id.cuartoFragmento) {
                loadFragment(cuartoFragmento);
                return true;
            } else if (itemId == R.id.quintoFragmento) {
                loadFragment(quintoFragmento);
                return true;
            }
            return false;

        }

    };
    private void loadFragment(Fragment fragment){
        FragmentTransaction transaction =  getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container,fragment);
        transaction.commit();

    }
}

