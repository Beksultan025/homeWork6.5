package com.example.testapp41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.testapp41.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupUI();
        divideUI();
    }

    private void setupUI() {
        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Maz maz = new Maz();
                String num1 = binding.num1Ed.getText().toString();
                String num2 = binding.num2Ed.getText().toString();
                String result = maz.add(num1, num2);
                binding.resultTv.setText(result);
            }
        });
    }

    private void divideUI() {
        binding.divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Maz maz = new Maz();
                String num1 = binding.num1Ed.getText().toString();
                String num2 = binding.num2Ed.getText().toString();
                String result = maz.divides(num1, num2);
                binding.resultTv.setText(result);
            }
        });
    }
}