package com.helloworld.App;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b);
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), CActivity.class);
//				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		System.out.println("Bcreate");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("Bpause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("Bstop");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("Brestart");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("Bstart");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("Bresume");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("destory");
	}
	
}
