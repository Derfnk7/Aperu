package com.example.aperu;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class binder extends BaseAdapter{
    private Context context;
    private List<Reunion> list_Reunion;
    private LayoutInflater inflater;
    public binder(Context context , List<Reunion> list_Reunion){
        this.context = context;
        this.list_Reunion = list_Reunion;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list_Reunion.size();
    }

    @Override
    public Reunion getItem(int position) {
        return list_Reunion.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.binder,null);
        Reunion currentItem = getItem(position);
        String heure_de_la_r_union = getItem(position).getHeure_de_la_r_union();
        String lieu_de_la_r_union = getItem(position).getLieu_de_la_r_union();
        String titre_de_la_r_union = getItem(position).getTitre_de_la_r_union();
        String date_de_la_r_union = getItem(position).getDate_de_la_r_union();
        ArrayList<String> listeParticipant = getItem(position).getListeParticipant();
        TextView reunionHeureview = convertView.findViewById(R.id.bloc);
        reunionHeureview.setText(titre_de_la_r_union + "  -  " + heure_de_la_r_union + "  -  " + lieu_de_la_r_union );
        TextView reunionparticipView = convertView.findViewById(R.id.participants);
        reunionparticipView.setText(listeParticipant.toString());


        return convertView;
    }
}

