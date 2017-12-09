package com.example.besai.wassalnimaak;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;




public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.OfferViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Offer> offerList ;

    //getting the context and product list with constructor
    public OfferAdapter(Context mCtx, List<Offer> offerList) {
        this.mCtx = mCtx;
        this.offerList = offerList;
    }


   /* public OfferViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.activity_offer, null);
        return new OfferViewHolder(view);

    }*/
    @Override
    public OfferViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            return new OfferViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_offer, parent, false));

    }

    @Override
    public void onBindViewHolder(OfferViewHolder holder, int position) {
        //getting the product of the specified position
        Offer product = offerList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }


    @Override
    public int getItemCount() {
        if (offerList == null)
        return 0;
        else
        return  offerList.size();
    }


    class OfferViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public OfferViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
