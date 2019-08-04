package ir.sass.musicplayer.fragments;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.VH>
{
    public List<PathModl> list;
    OnFragmentRelation fragment;

    public ListAdapter(List<PathModl> list, OnFragmentRelation fragment) {
        this.list = list;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    class VH extends RecyclerView.ViewHolder
    {
        public VH(@NonNull View itemView) {
            super(itemView);
        }
    }

    interface OnFragmentRelation
    {

    }
}
