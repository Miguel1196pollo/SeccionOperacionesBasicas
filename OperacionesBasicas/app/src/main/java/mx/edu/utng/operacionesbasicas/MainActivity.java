package mx.edu.utng.operacionesbasicas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Toshiba on 11/03/2017.
 */
public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    private ImageButton ibNumeroUno;
    private ImageButton ibNumeroDos;
    private ImageButton ibNumeroTres;
    private ImageButton ibNumeroCuatro;
    private ImageButton ibNumeroCinco;
    private ImageButton ibNumeroSeis;
    private ImageButton ibNumeroSiete;
    private ImageButton ibNumeroOcho;
    private ImageButton ibNumeroNueve;
    private ImageButton ibNumeroDiez;
    private ImageButton ibIr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_operations_main);

        ibNumeroUno = (ImageButton) findViewById(R.id.ib_numero_uno);
        ibNumeroDos = (ImageButton) findViewById(R.id.ib_numero_dos);
        ibNumeroTres = (ImageButton) findViewById(R.id.ib_numero_tres);
        ibNumeroCuatro = (ImageButton) findViewById(R.id.ib_numero_cuatro);
        ibNumeroCinco = (ImageButton) findViewById(R.id.ib_numero_cinco);
        ibNumeroSeis = (ImageButton) findViewById(R.id.ib_numero_seis);
        ibNumeroSiete = (ImageButton) findViewById(R.id.ib_numero_siete);
        ibNumeroOcho = (ImageButton) findViewById(R.id.ib_numero_ocho);
        ibNumeroNueve = (ImageButton) findViewById(R.id.ib_numero_nueve);
        ibNumeroDiez = (ImageButton) findViewById(R.id.ib_numero_diez);
        ibIr = (ImageButton) findViewById(R.id.ib_ir);

        ibIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irTwo = new Intent(MainActivity.this, OperationsBasicTwo.class);
                startActivity(irTwo);
            }
        });

        ibNumeroUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero1);

                mp.start();
            }

        });

        ibNumeroDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero2);

                mp.start();
            }

        });

        ibNumeroTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero3);

                mp.start();
            }

        });

        ibNumeroCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero4);

                mp.start();
            }

        });

        ibNumeroCinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero5);

                mp.start();
            }

        });

        ibNumeroSeis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero6);

                mp.start();
            }

        });


        ibNumeroSiete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero7);

                mp.start();
            }

        });


        ibNumeroOcho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero8);

                mp.start();
            }

        });

        ibNumeroNueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(MainActivity.this, R.raw.numero9);

                mp.start();
            }

        });
    }

}

