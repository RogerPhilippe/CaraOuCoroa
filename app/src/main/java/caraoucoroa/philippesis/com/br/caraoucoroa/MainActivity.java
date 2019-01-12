package caraoucoroa.philippesis.com.br.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView mbtnJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnJogar = findViewById(R.id.idBtnJogar);

        mbtnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Gerar número aleatório
                Random random = new Random();
                int numeroAleatorio = random.nextInt(2);

                // 0 cara - 1 coroa
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);
                startActivity(intent);

            }
        });

    }
}
