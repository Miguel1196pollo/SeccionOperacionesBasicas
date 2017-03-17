package mx.edu.utng.operacionesbasicas;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Toshiba on 15/03/2017.
 */
public class OperationsBasicTree extends AppCompatActivity {
    private ImageButton ibNumero34;
    private ImageButton ibNumero35;
    private ImageButton ibNumero36;
    private ImageButton ibNumero37;
    private ImageButton ibNumero38;
    private ImageButton ibNumero39;
    private ImageButton ibNumero40;
    private ImageButton ibNumero41;
    private ImageButton ibNumero42;
    private ImageButton ibNumero43;
    private ImageButton ibNumero44;
    private ImageButton ibNumero45;
    private ImageButton ibNumero46;
    private ImageButton ibNumero47;
    private ImageButton ibNumero48;
    private ImageButton ibGoFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_operations_tree);

        ibNumero34 = (ImageButton) findViewById(R.id.ib_numero_34);
        ibNumero35 = (ImageButton) findViewById(R.id.ib_numero_35);
        ibNumero36 = (ImageButton) findViewById(R.id.ib_numero_36);
        ibNumero37 = (ImageButton) findViewById(R.id.ib_numero_37);
        ibNumero38 = (ImageButton) findViewById(R.id.ib_numero_38);
        ibNumero39 = (ImageButton) findViewById(R.id.ib_numero_39);
        ibNumero40 = (ImageButton) findViewById(R.id.ib_numero_40);
        ibNumero41 = (ImageButton) findViewById(R.id.ib_numero_41);
        ibNumero42 = (ImageButton) findViewById(R.id.ib_numero_42);
        ibNumero43 = (ImageButton) findViewById(R.id.ib_numero_43);
        ibNumero44 = (ImageButton) findViewById(R.id.ib_numero_44);
        ibNumero45 = (ImageButton) findViewById(R.id.ib_numero_45);
        ibNumero46 = (ImageButton) findViewById(R.id.ib_numero_46);
        ibNumero47 = (ImageButton) findViewById(R.id.ib_numero_47);
        ibNumero48 = (ImageButton) findViewById(R.id.ib_numero_48);
        ibGoFour = (ImageButton) findViewById(R.id.ib_go_four);

        ibGoFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irFour = new Intent(OperationsBasicTree.this, OperationsBasicFour.class);
                startActivity(irFour);
            }
        });

    }
}

