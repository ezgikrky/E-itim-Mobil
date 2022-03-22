package com.example.proje.Oyunlar.Sözlük;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proje.R;

import java.util.List;


// 1-kart tasarımınıtemsil eden adaptör
public class KelimelerAdapter extends RecyclerView.Adapter<KelimelerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Kelimeler> kelimelerListe;

    public KelimelerAdapter(Context mContext, List<Kelimeler> kelimelerListe) {
        this.mContext = mContext;
        this.kelimelerListe = kelimelerListe;
    }

//3- kart tasarım sayfasını buraya bağlıyorum
    @Override
    public CardTasarimTutucu onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim,parent,false);

        return new CardTasarimTutucu(view);
    }

    @Override
    public void onBindViewHolder(CardTasarimTutucu holder, int position) {
        Kelimeler kelime = kelimelerListe.get(position);

        holder.textViewIngilizce.setText(kelime.getIngilizce().toUpperCase());
        holder.textViewTurkce.setText(kelime.getTurkce().toUpperCase());


        holder.kelime_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext,DetayActivity.class);

                intent.putExtra("nesne",kelime);

                mContext.startActivity(intent);

            }
        });

    }
    // 2-kard tasarımı üstündeki görsel nesneleri adaptöre bağlamak

    @Override
    public int getItemCount() {
        return kelimelerListe.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private TextView textViewIngilizce;
        private TextView textViewTurkce;
        private CardView kelime_card;

        public CardTasarimTutucu(View itemView) {
            super(itemView);
            textViewIngilizce = itemView.findViewById(R.id.textViewIngilizce);
            textViewTurkce = itemView.findViewById(R.id.textViewTurkce);
            kelime_card = itemView.findViewById(R.id.kelime_card);
        }
    }

}
