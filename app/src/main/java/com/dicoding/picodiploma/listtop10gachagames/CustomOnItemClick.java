package com.dicoding.picodiploma.listtop10gachagames;

import android.view.View;

class CustomOnItemClick implements View.OnClickListener {
    private OnItemClickCallback onItemClickCallback;
    private int position;

    public interface OnItemClickCallback {
        void onItemClicked(View view, int i);
    }

    public CustomOnItemClick(int position2, OnItemClickCallback onItemClickCallback2) {
        this.position = position2;
        this.onItemClickCallback = onItemClickCallback2;
    }

    public void onClick(View view) {
        this.onItemClickCallback.onItemClicked(view, this.position);
    }
}