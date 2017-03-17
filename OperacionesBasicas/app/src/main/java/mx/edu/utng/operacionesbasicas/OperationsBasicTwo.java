package mx.edu.utng.operacionesbasicas;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Toshiba on 15/03/2017.
 */
public class OperationsBasicTwo extends AppCompatActivity {
    MediaPlayer player;
    private ImageButton ibNumero19;
    private ImageButton ibNumero20;
    private ImageButton ibNumero21;
    private ImageButton ibNumero22;
    private ImageButton ibNumero23;
    private ImageButton ibNumero24;
    private ImageButton ibNumero25;
    private ImageButton ibNumero26;
    private ImageButton ibNumero27;
    private ImageButton ibNumero28;
    private ImageButton ibNumero29;
    private ImageButton ibNumero30;
    private ImageButton ibNumero31;
    private ImageButton ibNumero32;
    private ImageButton ibNumero33;
    private ImageButton ibGoTree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_operations_two);

        ibNumero19 = (ImageButton) findViewById(R.id.ib_numero_19);
        ibNumero20 = (ImageButton) findViewById(R.id.ib_numero_veinte);
        ibNumero21 = (ImageButton) findViewById(R.id.ib_numero_21);
        ibNumero22 = (ImageButton) findViewById(R.id.ib_numero_22);
        ibNumero23 = (ImageButton) findViewById(R.id.ib_numero_23);
        ibNumero24 = (ImageButton) findViewById(R.id.ib_numero_24);
        ibNumero25 = (ImageButton) findViewById(R.id.ib_numero_25);
        ibNumero26 = (ImageButton) findViewById(R.id.ib_numero_26);
        ibNumero27 = (ImageButton) findViewById(R.id.ib_numero_27);
        ibNumero28 = (ImageButton) findViewById(R.id.ib_numero_28);
        ibNumero29 = (ImageButton) findViewById(R.id.ib_numero_29);
        ibNumero30 = (ImageButton) findViewById(R.id.ib_numero_30);
        ibNumero31 = (ImageButton) findViewById(R.id.ib_numero_31);
        ibNumero32 = (ImageButton) findViewById(R.id.ib_numero_32);
        ibNumero33 = (ImageButton) findViewById(R.id.ib_numero_33);
        ibGoTree = (ImageButton) findViewById(R.id.ib_go_tree);

        ibGoTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irTree = new Intent(OperationsBasicTwo.this, OperationsBasicTree.class);
                startActivity(irTree);
            }
        });

    }
}
