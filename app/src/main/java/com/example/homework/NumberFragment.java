package com.example.homework;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NumberFragment extends Fragment {
    private String txt;

    public NumberFragment(String txt) {
        super();

        this.txt = txt;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_number, container, false);
        TextView textView;
        textView = v.findViewById(R.id.txt);
        textView.setText(txt);
        if (Integer.parseInt(txt) % 2 == 0)
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.colorRed));
        else
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.colorBlue));
        return  v;
    }
}
