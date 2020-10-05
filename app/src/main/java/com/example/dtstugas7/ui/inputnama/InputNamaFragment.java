package com.example.dtstugas7.ui.inputnama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.dtstugas7.R;

public class InputNamaFragment extends Fragment {

    private TextView textView;
    private EditText nama;
    private Button tampilkan;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inputnama, container, false);
        textView = root.findViewById(R.id.textView);
        nama = root.findViewById(R.id.nama);
        tampilkan = root.findViewById(R.id.tampilkan);
        tampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Nama Anda : "+nama.getText().toString());
            }
        });
        return root;
    }
}