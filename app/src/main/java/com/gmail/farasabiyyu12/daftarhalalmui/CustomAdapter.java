package com.gmail.farasabiyyu12.daftarhalalmui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gmail.farasabiyyu12.daftarhalalmui.ResponseServer.DataItem;

import java.util.List;

/**\
 *
 * Created by farasabiyyuhandoko on 30/03/2018.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context context;
    List<DataItem> data;
    public static final String WebUrl = "https://script.googleusercontent.com/macros/";

    public CustomAdapter(Context context, List<DataItem> dataItems) {
        this.context = context;
        this.data = dataItems;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item , parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {

        holder.title.setText(data.get(position).getTitle());
        holder.nomor_sertifikat.setText(data.get(position).getNomorSertifikat());
        holder.produsen.setText(data.get(position).getProdusen());
        holder.berlaku_hingga.setText(data.get(position).getBerlakuHingga());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, nomor_sertifikat, produsen, berlaku_hingga;



        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            nomor_sertifikat = itemView.findViewById(R.id.nomor_sertifikat);
            produsen = itemView.findViewById(R.id.produsen);
            berlaku_hingga = itemView.findViewById(R.id.berlaku_hingga);

        }
    }
}
