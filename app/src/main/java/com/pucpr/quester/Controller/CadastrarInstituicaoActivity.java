package com.pucpr.quester.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.pucpr.quester.R;

public class CadastrarInstituicaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_instituicao);

        setTitle("Cadastrar Instituição");
    }
}