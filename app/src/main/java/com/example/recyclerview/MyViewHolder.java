package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView fullNames, email, phoneNumber;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        fullNames = itemView.findViewById(R.id.fullNames);
        email = itemView.findViewById(R.id.email);
        phoneNumber = itemView.findViewById(R.id.phoneNumber);
    }

    public void bind(Item item) {
        // Bind data to views
        fullNames.setText(item.getName());
        email.setText(item.getEmail());
        phoneNumber.setText(item.getPhoneNumber());

        // Set image if needed
        // image.setImageResource(item.getImageResourceId());
    }
}
