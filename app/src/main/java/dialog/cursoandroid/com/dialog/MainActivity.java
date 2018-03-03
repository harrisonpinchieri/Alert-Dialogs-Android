package dialog.cursoandroid.com.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;

    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        botao = findViewById(R.id.botaoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                criar alert Dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //configurar o titulo
                dialog.setTitle("Titulo da dialog");

                //configurar a mensagem
                dialog.setMessage("Mensagem da dialog");


//                não deixa cancelar ao clicar fora da dialog
                dialog.setCancelable(false);
//                icone do título

                dialog.setIcon(android.R.drawable.ic_dialog_alert);


//                Botão negativo
                dialog.setNegativeButton("NÃO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this,"Pressionado botão não", Toast.LENGTH_SHORT).show();
                            }
                        });

//                Botão positivo
                dialog.setPositiveButton("SIM",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this,"Pressionado botão sim",Toast.LENGTH_SHORT).show();
                            }
                        });
                    dialog.create();
                    dialog.show();
            }
        });
    }
}
