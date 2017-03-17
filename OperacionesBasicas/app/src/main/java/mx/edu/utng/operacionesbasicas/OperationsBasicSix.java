package mx.edu.utng.operacionesbasicas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Toshiba on 15/03/2017.
 */
public class OperationsBasicSix extends AppCompatActivity {

    private ImageButton ibNumero79;
    private ImageButton ibNumero80;
    private ImageButton ibNumero81;
    private ImageButton ibNumero82;
    private ImageButton ibNumero83;
    private ImageButton ibNumero84;
    private ImageButton ibNumero85;
    private ImageButton ibNumero86;
    private ImageButton ibNumero87;
    private ImageButton ibNumero88;
    private ImageButton ibNumero89;
    private ImageButton ibNumero90;
    private ImageButton ibNumero91;
    private ImageButton ibNumero92;
    private ImageButton ibNumero93;
    private ImageButton ibGoSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_operations_six);

        ibNumero79 = (ImageButton) findViewById(R.id.ib_numero_79);
        ibNumero80 = (ImageButton) findViewById(R.id.ib_numero_80);
        ibNumero81 = (ImageButton) findViewById(R.id.ib_numero_81);
        ibNumero82 = (ImageButton) findViewById(R.id.ib_numero_82);
        ibNumero83 = (ImageButton) findViewById(R.id.ib_numero_83);
        ibNumero84 = (ImageButton) findViewById(R.id.ib_numero_84);
        ibNumero85 = (ImageButton) findViewById(R.id.ib_numero_85);
        ibNumero86 = (ImageButton) findViewById(R.id.ib_numero_86);
        ibNumero87 = (ImageButton) findViewById(R.id.ib_numero_87);
        ibNumero88 = (ImageButton) findViewById(R.id.ib_numero_88);
        ibNumero89 = (ImageButton) findViewById(R.id.ib_numero_89);
        ibNumero90 = (ImageButton) findViewById(R.id.ib_numero_90);
        ibNumero91 = (ImageButton) findViewById(R.id.ib_numero_91);
        ibNumero92 = (ImageButton) findViewById(R.id.ib_numero_92);
        ibNumero93 = (ImageButton) findViewById(R.id.ib_numero_93);
        ibGoSeven = (ImageButton) findViewById(R.id.ib_go_seven);

        ibGoSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irFour = new Intent(OperationsBasicSix.this, OperationsBasicSeven.class);
                startActivity(irFour);
            }
        });

    }
}

