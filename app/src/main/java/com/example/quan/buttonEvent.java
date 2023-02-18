package com.example.quan;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class buttonEvent implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.Button){
            TextView textView = view.getRootView().findViewById(R.id.textView);
            EditText text = view.getRootView().findViewById(R.id.eText);
            textView.setText(text.getText().toString());

        } else if (view.getId() == R.id.ButtonContent) {
            Toast toast = Toast.makeText(view.getContext().getApplicationContext(), "Baats ngowf chuwa thawngf ... ",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
