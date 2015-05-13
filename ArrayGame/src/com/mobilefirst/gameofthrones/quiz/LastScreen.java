package com.mobilefirst.gameofthrones.quiz;

import com.facebook.appevents.AppEventsLogger;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LastScreen extends Activity {
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_last_screen);
		
		
		Intent intentx = new Intent(LastScreen.this, serv.class);
		LastScreen.this.stopService(intentx);
		
		Typeface got = CustomFont.getTypeface(LastScreen.this, CustomFont.APP_FONT);
		TextView ans1 = (TextView) findViewById(R.id.textView1);
		
		ans1.setTypeface(got);
		ans1.setText("NOW THE IRON THRONE IS YOURS");
		
	}

}
