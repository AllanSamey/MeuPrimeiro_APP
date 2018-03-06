package br.usjt.ftce.progmulti.meuprimeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.usjt.ftce.progmulti.meuprimeiroapp.R;
//Arthur Segin Ribeiro - RA:816154363
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Arthur Segin Ribeiro - RA:816154363
    //constante static para identificar a mensagem
    public final static String EXTRA_MESSAGE =
            "br.usjt.ftce.progmulti.meuprimeiroapp.MESSAGE";
    //será chamado quando o usuário clicar em Enviar

    //Arthur Segin Ribeiro - RA:816154363
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
