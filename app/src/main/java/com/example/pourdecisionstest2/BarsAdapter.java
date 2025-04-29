package com.example.pourdecisionstest2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BarsAdapter extends RecyclerView.Adapter<BarsAdapter.ViewHolder> {
    public interface BarClickListener {
        void onBarClick(BarsActivity.Bar bar);
    }

    private final List<BarsActivity.Bar> bars;
    private final BarClickListener clickListener;

    public BarsAdapter(List<BarsActivity.Bar> bars, BarClickListener clickListener) {
        this.bars = bars;
        this.clickListener = clickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.card_text);
        }
        public void bind(BarsActivity.Bar bar, BarClickListener listener) {
            textView.setText(bar.name);
            itemView.setOnClickListener(v -> listener.onBarClick(bar));
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(bars.get(position), clickListener);
    }

    @Override
    public int getItemCount() {
        return bars.size();
    }
}