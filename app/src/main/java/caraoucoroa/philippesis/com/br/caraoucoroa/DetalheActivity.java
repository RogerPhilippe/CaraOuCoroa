package caraoucoroa.philippesis.com.br.caraoucoroa;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        ImageView mmoeda = findViewById(R.id.idMoeda);

        ImageView btnVoltar = findViewById(R.id.idBtnVoltar);

        Bundle bundle = getIntent().getExtras();

        if(!bundle.isEmpty() && bundle.get("opcao").equals("cara")) {

            mmoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));

        } else if (!bundle.isEmpty() && bundle.get("opcao").equals("coroa")){

            mmoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));

        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
