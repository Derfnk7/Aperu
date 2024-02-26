
package com.example.aperu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.TextView;


import java.util.ArrayList;


public class home_screen_activity extends Activity {

	ArrayList<String> Participants = new ArrayList<String>();

	Reunion reunion;

	String heure_de_la_r_union, lieu_de_la_r_union, titre_de_la_r_union, date_de_la_r_union;

	ListView listView;

	list_reunion list_reunion = new list_reunion();


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen);

		listView = findViewById(R.id.reunion_list_view);
		Bundle extras = getIntent().getExtras();

		Participants.add("participant@gmail.com");
		Participants.add("participants@gmail.com");
				if (extras != null) {
					heure_de_la_r_union = extras.getString("heure_de_la_r_union");
					lieu_de_la_r_union = extras.getString("lieu_de_la_r_union");
					titre_de_la_r_union = extras.getString("titre_de_la_r_union");
					date_de_la_r_union = extras.getString("date_de_la_r_union");

					reunion = new Reunion(heure_de_la_r_union, lieu_de_la_r_union, titre_de_la_r_union, date_de_la_r_union, Participants);
					list_reunion.list_reunion.add(reunion);
				}

				listView.setAdapter(new binder(this, list_reunion.list_reunion));

	}

	public void add(View view) {
		Intent intent = new Intent(this, create_screen_activity.class);
		startActivity(intent);
	}
}

	class Reunion {
		private String heure_de_la_r_union;
		private String lieu_de_la_r_union;
		private String titre_de_la_r_union;
		private String date_de_la_r_union;
		private ArrayList<String> listeParticipant = new ArrayList<String>();

		public Reunion(String h,String s,String t,String d,ArrayList<String> Participants) {
			this.heure_de_la_r_union = h;
			this.titre_de_la_r_union = t;
			this.lieu_de_la_r_union = s;
			this.date_de_la_r_union = d;
			this.listeParticipant = Participants;
		}

		String getHeure_de_la_r_union() {
			return heure_de_la_r_union;
		}

		String getLieu_de_la_r_union() {
			return lieu_de_la_r_union;
		}

		String getTitre_de_la_r_union() {
			return titre_de_la_r_union;
		}

		String getDate_de_la_r_union() {
			return date_de_la_r_union;
		}

		ArrayList<String> getListeParticipant() {
			return listeParticipant;
		}

		void setHeure_de_la_r_union(String heure_de_la_r_union) {
			this.heure_de_la_r_union = heure_de_la_r_union;
		}

		void setLieu_de_la_r_union(String lieu_de_la_r_union) {
			this.lieu_de_la_r_union = lieu_de_la_r_union;
		}

		void setListeParticipant(ArrayList<String> listeParticipant) {
			this.listeParticipant = listeParticipant;
		}

		void setTitre_de_la_r_union(String titre_de_la_r_union) {
			this.titre_de_la_r_union = titre_de_la_r_union;
		}

		void setDate_de_la_r_union(String date_de_la_r_union) {
			this.date_de_la_r_union = date_de_la_r_union;
		}
	}
class list_reunion {
		public static ArrayList<Reunion> list_reunion = new ArrayList<Reunion>();
	}



