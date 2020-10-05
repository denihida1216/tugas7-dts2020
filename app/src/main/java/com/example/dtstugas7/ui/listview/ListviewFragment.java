package com.example.dtstugas7.ui.listview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dtstugas7.R;

public class ListviewFragment extends Fragment {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private String[] namanegara = new String[]{"Indonesia", "Malaysia", "Singapore", "Italia", "Inggris",
            "Belanda", "Argentina", "Chile", "Mesir", "Uganda"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_listview, container, false);
        listView = root.findViewById(R.id.listview);
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),
                        "You have selected : " + namanegara[position],
                        Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}