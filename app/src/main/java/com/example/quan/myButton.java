package com.example.quan;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class myButton implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        TextView textView = (TextView) view.getRootView().findViewById(R.id.textView);
        EditText editText = (EditText) view.findViewById(R.id.eText);
        textView.setText(editText.getText().toString());
    }
}
