package com.abeyler.gykfragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    private EditText inputWeight, inputHeight;
    private Button calculateBttn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        inputHeight = view.findViewById(R.id.userHeight);
        inputWeight = view.findViewById(R.id.userWeight);
        calculateBttn = view.findViewById(R.id.calculateBttn);
        calculateBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateIdealWeight();
            }
        });
        return view;

    }

    private void calculateIdealWeight() {

        if (inputHeight.getText().toString().length() > 0 && inputWeight.getText().toString().length() > 0) {


            float userLength =  Float.parseFloat(inputHeight.getText().toString());
            float userWeight = Float.parseFloat(inputWeight.getText().toString());
            if(userLength>0){
                userLength = userLength / 100;
                float result = (userWeight / ((userLength * userLength)));

                String resultDescription = "";

                if (result < 15) {
                    resultDescription = "Aşırı Zayıf";
                } else if (result > 15 && result <= 30) {
                    resultDescription = "Zayıf";
                } else if (result > 30 && result <= 40) {
                    resultDescription = "Normal";
                } else if (result > 40) {
                    resultDescription = "Aşırı Şişman (Morbid Obez)";
                } else {
                    resultDescription = "Aşırı Şişman (Morbid Obez)";
                }

                Toast.makeText(getActivity(),"Vücut kitle endeksiniz: " + result + "\n" + resultDescription,Toast.LENGTH_LONG).show();

            }}else {

            final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setTitle("Hata!");
            builder.setMessage("Kilo ya da boy boş bırakılamaz.");
            builder.setNegativeButton("TAMAM", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int id) {

                }
            });

            builder.show();
        }
    }
}
