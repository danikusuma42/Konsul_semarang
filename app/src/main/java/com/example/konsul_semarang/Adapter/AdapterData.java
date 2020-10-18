package com.example.konsul_semarang.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.konsul_semarang.Model.DataModel;
import com.example.konsul_semarang.R;

import java.util.List;

public class AdapterData extends  RecyclerView.Adapter<AdapterData.HolderData>
{
   private Context ctx;
   private List<DataModel> listKonsul;

    public AdapterData(Context ctx, List<DataModel> listkonsul)
    {
        this.ctx = ctx;
        this.listKonsul = listkonsul;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        HolderData holder = new HolderData(layout);
        return holder;



    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {

        DataModel dm = listKonsul.get(position);

        holder.tvid.setText(String.valueOf(dm.getId()));
        holder.tvnama.setText(dm.getNama());
        holder.tvalamat.setText(dm.getAlamat());
        holder.tvtelepon.setText(dm.getTelepon());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HolderData extends RecyclerView.ViewHolder
    {
        TextView tvid, tvnama, tvalamat, tvtelepon;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            tvnama = itemView.findViewById(R.id.tv_nama);
            tvalamat = itemView.findViewById(R.id.tv_alamat);
            tvtelepon = itemView.findViewById(R.id.telepon);
            tvid = itemView.findViewById(R.id.tv_id);
        }
    }
}
