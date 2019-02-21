package com.example.curacao.juegotext;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaracion de variables, del mismo tipo usados en el Layout "principal"
    //cajas de texto
    private TextView bienv;
    private TextView fin;
    private TextView mostrarRecord;
    //LinearLayout, que contienen las preguntas junto a sus respectivos botones
    //con las posibles respuestas
    private LinearLayout f1;
    private LinearLayout f2;
    private LinearLayout f3;
    private LinearLayout f4;
    private LinearLayout f5;
    private LinearLayout f6;
    private LinearLayout f7;
    private LinearLayout f8;
    private LinearLayout f9;
    private LinearLayout f10;
    //Botones, para iniciar el juego, mostrar récord
    //Botones para las respuestas respectivas de cada pregunta
    //se han creado botones con respuestas correctas e incorrectas
    //para poder mostrar al finalizar el juego: los puntos obtenidos
    private Button jugar;
    private ImageButton record;
    private Button r1c;
    private Button r1i;
    private Button r2c;
    private Button r2i;
    private Button r3c;
    private Button r3i;
    private Button r4c;
    private Button r4i;
    private Button r5c;
    private Button r5i;
    private Button r6c;
    private Button r6i;
    private Button r7c;
    private Button r7i;
    private Button r8c;
    private Button r8i;
    private Button r9c;
    private Button r9i;
    private Button r10c;
    private Button r10i;
    //se han creado dos contadores, para saber el total de respuestas correctas
    //e incorrectas, aunque al final solo se mostrará los puntos obtenidos
    private int contadorC=0;
    private int contadorI=0;


    //método OnCreate que inicializa la actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se extraen los valores de el Layout, para poder manipularlos
        //cajas de texto
        bienv = findViewById(R.id.bienv);
        fin = findViewById(R.id.fin);
        //LinearLayout
        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);
        f6 = findViewById(R.id.f6);
        f7 = findViewById(R.id.f7);
        f8 = findViewById(R.id.f8);
        f9 = findViewById(R.id.f9);
        f10 = findViewById(R.id.f10);
        //Botones
        //Principales
        jugar= findViewById(R.id.jug);
        record=findViewById(R.id.rec);
        mostrarRecord=findViewById(R.id.record);
        //Respuestas
        r1c = findViewById(R.id.r1c);
        r1i = findViewById(R.id.r1i);
        r2c = findViewById(R.id.r2c);
        r2i = findViewById(R.id.r2i);
        r3c = findViewById(R.id.r3c);
        r3i = findViewById(R.id.r3i);
        r4c = findViewById(R.id.r4c);
        r4i = findViewById(R.id.r4i);
        r5c = findViewById(R.id.r5c);
        r5i = findViewById(R.id.r5i);
        r6c = findViewById(R.id.r6c);
        r6i = findViewById(R.id.r6i);
        r7c = findViewById(R.id.r7c);
        r7i = findViewById(R.id.r7i);
        r8c = findViewById(R.id.r8c);
        r8i = findViewById(R.id.r8i);
        r9c = findViewById(R.id.r9c);
        r9i = findViewById(R.id.r9i);
        r10c = findViewById(R.id.r10c);
        r10i = findViewById(R.id.r10i);

        //Adicionamos los escuchadores para saber cuando se acciona el botón
        //Dentro del método OnCreate tambien llamamos el método OnClic
        //de cada uno de los botones, tanto los principales, como los que
        //contienen las respuestas
        //el mismo boton hace que el formulario actual se oculte
        //y el siguiente sea visible
        //Los botones de respuesta aumentan un contador en 1, para obtener
        // el conteo de respuestas correctas e incorrectas
        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1.setVisibility(View.VISIBLE);
                bienv.setVisibility(View.INVISIBLE);

            }
        });
        r1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1.setVisibility(View.INVISIBLE);
                f2.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r1i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1.setVisibility(View.INVISIBLE);
                f2.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2.setVisibility(View.INVISIBLE);
                f3.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r2i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2.setVisibility(View.INVISIBLE);
                f3.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f3.setVisibility(View.INVISIBLE);
                f4.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r3i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f3.setVisibility(View.INVISIBLE);
                f4.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f4.setVisibility(View.INVISIBLE);
                f5.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r4i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f4.setVisibility(View.INVISIBLE);
                f5.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f5.setVisibility(View.INVISIBLE);
                f6.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r5i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f5.setVisibility(View.INVISIBLE);
                f6.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r6c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f6.setVisibility(View.INVISIBLE);
                f7.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r6i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f6.setVisibility(View.INVISIBLE);
                f7.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r7c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f7.setVisibility(View.INVISIBLE);
                f8.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r7i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f7.setVisibility(View.INVISIBLE);
                f8.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r8c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f8.setVisibility(View.INVISIBLE);
                f9.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r8i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f8.setVisibility(View.INVISIBLE);
                f9.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r9c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f9.setVisibility(View.INVISIBLE);
                f10.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r9i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f9.setVisibility(View.INVISIBLE);
                f10.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        r10c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f10.setVisibility(View.INVISIBLE);
                fin.setVisibility(View.VISIBLE);
                contadorC++;
            }
        });
        r10i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f10.setVisibility(View.INVISIBLE);
                fin.setVisibility(View.VISIBLE);
                contadorI++;
            }
        });
        //Muestra los puntos obtenidos
        record.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                fin.setVisibility(View.INVISIBLE);
                mostrarRecord.setVisibility(View.VISIBLE);
                contadorC*=100;
                contadorI*=100;

                mostrarRecord.setText("¡¡¡Felicidades has obtenido " + contadorC + " puntos");
            }
        });//cierra record
    }//cierra onCreate
}//cierra MainActivity
