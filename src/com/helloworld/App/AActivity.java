package com.helloworld.App;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;

public class AActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helloworld);
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),BActivity.class);
//				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		System.out.println("Acreate");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("Apause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("Astop");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("Arestart");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("Astart");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("Aresume");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("Adestory");
	}
	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
		SparseBooleanArray a = new SparseBooleanArray();
		LongSparseArray<AActivity> l = new LongSparseArray<AActivity>();
//		l.put(arg0, arg1)
		Map<Activity, String> m = new HashMap<Activity, String>();
		SparseArray<Activity> s = new SparseArray<Activity>();
		
	}
	
}
