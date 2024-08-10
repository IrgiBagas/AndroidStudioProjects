package com.komputerkit.recyclerviewcardview;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.ViewHolder>{
    private Context context;
    private List<Siswa> siswaList;

    public SiswaAdapter(Context context, List<Siswa> siswaList) {
        this.context = context;
        this.siswaList = siswaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate((R.layout.item_siswa,viewGroup, false));
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Siswa siswa = siswaList.get(i);
        viewHolder.nama.setText();
    }

    @Override
    public int getItemCount() {
        return siswaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nama, alamat;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            alamat = itemView.findViewById(R.id.alamat);
        }
    }
}
