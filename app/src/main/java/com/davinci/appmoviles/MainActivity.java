package com.davinci.appmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.button_texto);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                LinearLayout scrolleable = findViewById(R.id.scrolleable);
                    LinearLayout nuevoPost = new LinearLayout(button.getContext());
                    //ImageView imagenNuevoPost = new ImageView(button.getContext());
                    TextView textoNuevoPost = new TextView(button.getContext());
                    nuevoPost.setOrientation(LinearLayout.VERTICAL);
                    //imagenNuevoPost.setBackground(
                     //       getDrawable(R.drawable.ic_launcher_foreground));
                    textoNuevoPost.setText("Nueva Publi");

                    //nuevoPost.addView(imagenNuevoPost);
                    nuevoPost.addView(textoNuevoPost);
                scrolleable.addView(nuevoPost);
            }

        });

    }
}