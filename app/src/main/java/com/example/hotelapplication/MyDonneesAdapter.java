package com.example.hotelapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MyDonneesAdapter extends RecyclerView.Adapter<MyDonneesAdapter.ViewHolder> {

    private final List<Donnees> mList;
    private MainActivity2 mMainActivity2;
    private Context context;


    public MyDonneesAdapter ( List<Donnees> mList,Context context) {

     this.mList = mList;
     this.context = context;


    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)

    {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        View view = mInflater.inflate(R.layout.move_item_list,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    final Donnees donnees = mList.get(position);
    holder.tv_name.setText(mList.get(position).getTitre());
    holder.img_viewHolder.setImageResource(mList.get(position).getIntImage());
    holder.tv_description.setText(mList.get(position).getContenu());

    if(holder.getAdapterPosition()==1) {

      holder.img_viewHolder.setOnClickListener((v) -> {

        Intent intent = new Intent(context,MainActivityInformation.class);
        context.startActivity(intent);

      });



    }


    if (holder.getAdapterPosition()==0) {

        holder.img_viewHolder.setOnClickListener((v) ->  {

          Intent intent2 = new Intent(context,MainActivityContact.class);
          context.startActivity(intent2);

        });

    }

    if (holder.getAdapterPosition()==3) {

        holder.img_viewHolder.setOnClickListener((v) ->  {

            Intent intent = new Intent(context,MainActivityPlan.class);
            context.startActivity(intent);

        });
        }

    }


    @Override
    public int getItemCount() {

        return mList.size();

    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

//CLASSE INTERNE VUE


    public class ViewHolder extends RecyclerView.ViewHolder {

    TextView tv_name;
    TextView tv_description;
    ImageView img_viewHolder;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.textName);
            img_viewHolder = (ImageView) itemView.findViewById(R.id.imageView);
            tv_description = (TextView) itemView.findViewById(R.id.textDescription);


        }


        }
    }

