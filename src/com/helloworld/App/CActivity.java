package com.helloworld.App;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

public class CActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.c);
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), BActivity.class);
//				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
			}
		});
		System.out.println("Ccreate");
	}
	@Override
	protected void onResume() {
		super.onPause();
		System.out.println("Cresume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("Cpause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("Cstop");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("Crestart");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("Cstart");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("Cdestory");
	}
}
