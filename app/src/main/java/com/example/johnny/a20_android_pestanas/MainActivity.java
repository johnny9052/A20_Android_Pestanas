package com.example.johnny.a20_android_pestanas;

import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Accedo a los recursos generales de la view para manipularlos, añadiendo elementos
        //dinamicamente como texto o iconos.
        Resources res = getResources();

        // Se selecciona el tabhost definida ya en el layout
        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);

        // Se inicia la configuracion
        tabs.setup();

        // Se nombra la primera pestaña (el parametro es un tag que se le da)
        TabHost.TabSpec spec = tabs.newTabSpec("mitab1");

        // Se selecciona el contenido del tab1 y se agrega
        spec.setContent(R.id.pestana1);

        // Se le añade un texto o un icono a la pestaña #1
        spec.setIndicator("", ContextCompat.getDrawable(this, android.R.drawable.ic_btn_speak_now));

        // Se añade toda la configuracion a la pestaña
        tabs.addTab(spec);


        /*********************************************/
        /*********CONFIGURACION PESTAÑA #2************/
        /*********************************************/

        // Se nombra la primera pestaña (el parametro es un tag que se le da)
        spec = tabs.newTabSpec("mitab2");

        // Se selecciona el contenido del tab2 y se agrega
        spec.setContent(R.id.pestana2);

        // Se le añade un icono o texto a la pestaña
        spec.setIndicator("D", ContextCompat.getDrawable(this, android.R.drawable.ic_delete));

        // Se añade toda la configuracion a la pestaña
        tabs.addTab(spec);

        // Se selecciona la pestaña por defecto
        tabs.setCurrentTab(0);

        // Se añade evento al cambio de pestaña
        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {

                Toast.makeText(getApplicationContext(), "AndroidTabsDemo",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
