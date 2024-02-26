
package com.example.aperu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class create_screen_activity extends Activity {

	EditText titre_de_la_r_union;
	EditText date_de_la_r_union;
	EditText heure_de_la_r_union;
	EditText lieu_de_la_r_union;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_screen);
		titre_de_la_r_union = (EditText) this.findViewById(R.id.titre_de_la_r_union);
		date_de_la_r_union = (EditText) this.findViewById(R.id.date_de_la_r_union);
		heure_de_la_r_union = (EditText) this.findViewById(R.id.heure_de_la_r_union);
		lieu_de_la_r_union = (EditText) this.findViewById(R.id.lieu_de_la_r_union);

	}
	public void save(View view) {

		Intent intent = new Intent(getApplicationContext(), home_screen_activity.class);
		intent.putExtra("titre_de_la_r_union", titre_de_la_r_union.getText().toString());
		intent.putExtra("date_de_la_r_union", date_de_la_r_union.getText().toString());
		intent.putExtra("heure_de_la_r_union", heure_de_la_r_union.getText().toString());
		intent.putExtra("lieu_de_la_r_union", lieu_de_la_r_union.getText().toString());
		startActivity(intent);
	}

	public void exit(View view) {
		Intent intent = new Intent(getApplicationContext(), home_screen_activity.class);
		startActivity(intent);
	}
}
	
	