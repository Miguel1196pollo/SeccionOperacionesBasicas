package mx.edu.utng.operacionesbasicas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Toshiba on 15/03/2017.
 */
public class OperationsBasicFive extends AppCompatActivity {

    private ImageButton ibNumero64;
    private ImageButton ibNumero65;
    private ImageButton ibNumero66;
    private ImageButton ibNumero67;
    private ImageButton ibNumero68;
    private ImageButton ibNumero69;
    private ImageButton ibNumero70;
    private ImageButton ibNumero71;
    private ImageButton ibNumero72;
    private ImageButton ibNumero73;
    private ImageButton ibNumero74;
    private ImageButton ibNumero75;
    private ImageButton ibNumero76;
    private ImageButton ibNumero77;
    private ImageButton ibNumero78;
    private ImageButton ibGoSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_operations_five);

        ibNumero64 = (ImageButton) findViewById(R.id.ib_numero_64);
        ibNumero65 = (ImageButton) findViewById(R.id.ib_numero_65);
        ibNumero66 = (ImageButton) findViewById(R.id.ib_numero_66);
        ibNumero67 = (ImageButton) findViewById(R.id.ib_numero_67);
        ibNumero68 = (ImageButton) findViewById(R.id.ib_numero_68);
        ibNumero69 = (ImageButton) findViewById(R.id.ib_numero_69);
        ibNumero70 = (ImageButton) findViewById(R.id.ib_numero_70);
        ibNumero71 = (ImageButton) findViewById(R.id.ib_numero_71);
        ibNumero72 = (ImageButton) findViewById(R.id.ib_numero_72);
        ibNumero73 = (ImageButton) findViewById(R.id.ib_numero_73);
        ibNumero74 = (ImageButton) findViewById(R.id.ib_numero_74);
        ibNumero75 = (ImageButton) findViewById(R.id.ib_numero_75);
        ibNumero76 = (ImageButton) findViewById(R.id.ib_numero_76);
        ibNumero77 = (ImageButton) findViewById(R.id.ib_numero_77);
        ibNumero78 = (ImageButton) findViewById(R.id.ib_numero_78);
        ibGoSix = (ImageButton) findViewById(R.id.ib_go_six);

        ibGoSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irFour = new Intent(OperationsBasicFive.this, OperationsBasicSix.class);
                startActivity(irFour);
            }
        });

    }
}

