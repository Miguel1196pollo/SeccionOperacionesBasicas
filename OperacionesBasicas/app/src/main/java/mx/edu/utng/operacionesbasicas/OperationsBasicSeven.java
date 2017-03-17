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
public class OperationsBasicSeven extends AppCompatActivity {
    private ImageButton ibNumero94;
    private ImageButton ibNumero95;
    private ImageButton ibNumero96;
    private ImageButton ibNumero97;
    private ImageButton ibNumero98;
    private ImageButton ibNumero99;
    private ImageButton ibNumero100;
    private ImageButton ibReturnSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_operations_seven);

        ibNumero94 = (ImageButton) findViewById(R.id.ib_numero_94);
        ibNumero95 = (ImageButton) findViewById(R.id.ib_numero_95);
        ibNumero96 = (ImageButton) findViewById(R.id.ib_numero_96);
        ibNumero97 = (ImageButton) findViewById(R.id.ib_numero_97);
        ibNumero98 = (ImageButton) findViewById(R.id.ib_numero_98);
        ibNumero99 = (ImageButton) findViewById(R.id.ib_numero_99);
        ibNumero100 = (ImageButton) findViewById(R.id.ib_numero_100);
        ibReturnSix = (ImageButton) findViewById(R.id.ib_return_six);

        ibReturnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irFour = new Intent(OperationsBasicSeven.this, OperationsBasicSix.class);
                startActivity(irFour);
            }
        });

    }


    }
