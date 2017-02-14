package com.rrmsense.banglanewspaper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BanglaNewspaperAdapter extends RecyclerView.Adapter<BanglaNewspaperAdapter.ViewHolder> {
    private ArrayList<BanglaNewspaper> banglaNewspapers;
    private Context mContext;

    public BanglaNewspaperAdapter(ArrayList<BanglaNewspaper> banglaNewspapers, Context mContext) {
        this.banglaNewspapers = banglaNewspapers;
        this.mContext = mContext;
    }

    @Override
    public BanglaNewspaperAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_bangla_newspaper, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BanglaNewspaperAdapter.ViewHolder viewHolder, int i) {
        viewHolder.text_newspaper.setText(banglaNewspapers.get(i).getName());
        viewHolder.image_newspaper.setImageDrawable(banglaNewspapers.get(i).getImge());
        viewHolder.id_newspaper.setText(Integer.toString(banglaNewspapers.get(i).getId()));
    }

    @Override
    public int getItemCount() {
        return banglaNewspapers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView text_newspaper;
        private ImageView image_newspaper;
        private TextView id_newspaper;

        public ViewHolder(View view) {
            super(view);

            text_newspaper = (TextView) view.findViewById(R.id.text_newspaper);
            id_newspaper= (TextView) view.findViewById(R.id.id_newspaper);
            image_newspaper = (ImageView) view.findViewById(R.id.image_newspaper);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,id_newspaper.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}