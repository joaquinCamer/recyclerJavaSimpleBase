package com.example.recyclerjavasimple;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.recyclerjavasimple.ItemFragment.OnListFragmentInteractionListener;


import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Item} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {
private Context ctx;
    private final List<Item> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyItemRecyclerViewAdapter( Context context,  List<Item> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
        ctx=context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textView.setText(holder.mItem.getNombre());
        holder.textView2.setText(holder.mItem.getDireccion());
        holder.rtbar.setRating(holder.mItem.getValoracion());

        Glide.with(ctx)
                .load(holder.mItem.getUrlphoto())

                .into(holder.imageView);






        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textView;
        public final TextView textView2;
        public final ImageView imageView;
        public final RatingBar rtbar;
        public Item mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;

            textView=  view.findViewById(R.id.textView);
            textView2 =  view.findViewById(R.id.textView2);
            imageView=view.findViewById(R.id.imageView);
            rtbar=view.findViewById(R.id.ratingBar);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textView2.getText() + "'";
        }
    }
}
