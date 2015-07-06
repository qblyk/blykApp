package com.example.blykapp;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//Ö÷º¯Êý
public class MainActivity extends Activity {

	private Button btnStartAty1;
	private TextView tvOut;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnStartAty1 = (Button) findViewById(R.id.btnStartAty1);
        btnStartAty1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				

				Intent i = new Intent(MainActivity.this,Aty1.class);
				
				i.putExtra("txt", "my space");
				
//				startActivity(i);
				startActivityForResult(i, 0);
				
			}
		});
        
        tvOut = (TextView) findViewById(R.id.tvOut);
        
        
    }

    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	
    	String result = data.getStringExtra("result");
    	tvOut.setText(result);
    	
    	super.onActivityResult(requestCode, resultCode, data);
    	
    	
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
