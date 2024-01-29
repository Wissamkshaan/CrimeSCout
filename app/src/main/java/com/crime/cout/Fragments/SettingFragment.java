package com.crime.cout.Fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import com.crime.cout.Data.DataFile;
import com.crime.cout.R;
import com.google.android.gms.maps.GoogleMap;


public class SettingFragment extends Fragment {
     View view;
     EditText editTextNumber;
     CheckBox checkBoxN,checkBoxS,checkBoxH
             ,checkBoxT;
     Button buttonUpdate;
     DataFile dataFile;
     TextView textViewRadius;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_setting, container, false);
        dataFile=new DataFile(getContext());
        initUI();
        getData();
        return  view;

    }

    private void getData() {
        textViewRadius.setText("Current radius : "+dataFile.getRadius());
        if(dataFile.getMapType().equals("n")){
            checkBoxN.setChecked(true);
        }else if(dataFile.getMapType().equals("t")){
            checkBoxT.setChecked(true);
        }if(dataFile.getMapType().equals("h")){
            checkBoxH.setChecked(true);
        }if(dataFile.getMapType().equals("s")){
            checkBoxS.setChecked(true);
        }

    }

    private void initUI() {
        editTextNumber=view.findViewById(R.id.editTextNumber);
        checkBoxN=view.findViewById(R.id.checkBoxN);
        checkBoxS=view.findViewById(R.id.checkBoxS);
        checkBoxH=view.findViewById(R.id.checkBoxH);
        checkBoxT=view.findViewById(R.id.checkBoxT);
        buttonUpdate=view.findViewById(R.id.buttonUpdate);
        textViewRadius=view.findViewById(R.id.textViewRadius);
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius=editTextNumber.getText().toString();
                if(radius.equals("")){
                    editTextNumber.setError("Radius required");

                }else {
                    dataFile.setRadius(radius);
                    editTextNumber.setText("");
                    Toast.makeText(getContext(), "Updated successfully", Toast.LENGTH_SHORT).show();
                }

            }
        });

        checkBoxN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxN.setChecked(true);
                checkBoxS.setChecked(false);
                checkBoxH.setChecked(false);
                checkBoxT.setChecked(false);
                dataFile.setMapType("n");
            }
        });
        checkBoxS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxN.setChecked(false);
                checkBoxS.setChecked(true);
                checkBoxH.setChecked(false);
                checkBoxT.setChecked(false);
                dataFile.setMapType("s");
            }
        });
        checkBoxH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxN.setChecked(false);
                checkBoxS.setChecked(false);
                checkBoxH.setChecked(true);
                checkBoxT.setChecked(false);
                dataFile.setMapType("h");
            }
        });

        checkBoxT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxN.setChecked(false);
                checkBoxS.setChecked(false);
                checkBoxH.setChecked(false);
                checkBoxT.setChecked(true);
                dataFile.setMapType("t");
            }
        });
    }


}