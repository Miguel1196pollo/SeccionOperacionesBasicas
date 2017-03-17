package mx.edu.utng.operacionesbasicas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Toshiba on 15/03/2017.
 */
public class OperationsBasicFour extends AppCompatActivity {

    private ImageButton ibNumero49;
    private ImageButton ibNumero50;
    private ImageButton ibNumero51;
    private ImageButton ibNumero52;
    private ImageButton ibNumero53;
    private ImageButton ibNumero54;
    private ImageButton ibNumero55;
    private ImageButton ibNumero56;
    private ImageButton ibNumero57;
    private ImageButton ibNumero58;
    private ImageButton ibNumero59;
    private ImageButton ibNumero60;
    private ImageButton ibNumero61;
    private ImageButton ibNumero62;
    private ImageButton ibNumero63;
    private ImageButton ibGoFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_operations_four);

        ibNumero49 = (ImageButton) findViewById(R.id.ib_numero_49);
        ibNumero50 = (ImageButton) findViewById(R.id.ib_numero_50);
        ibNumero51 = (ImageButton) findViewById(R.id.ib_numero_51);
        ibNumero52 = (ImageButton) findViewById(R.id.ib_numero_52);
        ibNumero53 = (ImageButton) findViewById(R.id.ib_numero_53);
        ibNumero54 = (ImageButton) findViewById(R.id.ib_numero_54);
        ibNumero55 = (ImageButton) findViewById(R.id.ib_numero_55);
        ibNumero56 = (ImageButton) findViewById(R.id.ib_numero_56);
        ibNumero57 = (ImageButton) findViewById(R.id.ib_numero_57);
        ibNumero58 = (ImageButton) findViewById(R.id.ib_numero_58);
        ibNumero59 = (ImageButton) findViewById(R.id.ib_numero_59);
        ibNumero60 = (ImageButton) findViewById(R.id.ib_numero_60);
        ibNumero61 = (ImageButton) findViewById(R.id.ib_numero_61);
        ibNumero62 = (ImageButton) findViewById(R.id.ib_numero_62);
        ibNumero63 = (ImageButton) findViewById(R.id.ib_numero_63);
        ibGoFive = (ImageButton) findViewById(R.id.ib_go_five);

        ibGoFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irFour = new Intent(OperationsBasicFour.this, OperationsBasicFive.class);
                startActivity(irFour);
            }
        });

    }
}

