package com.example.kuis1_1718002;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder> {

    Context context;
    private ArrayList<Keluarga> dataList;
    public KeluargaAdapter(ArrayList<Keluarga> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }

    public void onBindViewHolder(KeluargaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getUmur());
        holder.txtNoHp.setText(dataList.get(position).getStatus());
        holder.img_gmbr.setImageDrawable(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;
        private ImageView img_gmbr;

        public KeluargaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_umur);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_status);
            img_gmbr = (ImageView) itemView.findViewById(R.id.img_icon);
        }
    }
}
