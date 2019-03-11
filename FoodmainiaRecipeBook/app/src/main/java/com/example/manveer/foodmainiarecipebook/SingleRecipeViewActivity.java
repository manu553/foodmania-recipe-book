package com.example.manveer.foodmainiarecipebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SingleRecipeViewActivity extends AppCompatActivity {

    private Button addItemBtn;

    public String valueFromDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_recipe_view);

        Spinner versionSelectorSpinner = findViewById(R.id.versionSelector);
        addItemBtn = findViewById(R.id.addItemBtn);

        setDialogListener();

        ArrayAdapter<String> versionSelectorAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.versions));

        versionSelectorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        versionSelectorSpinner.setAdapter( versionSelectorAdapter );
    }

    private void setDialogListener() {
        addItemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
