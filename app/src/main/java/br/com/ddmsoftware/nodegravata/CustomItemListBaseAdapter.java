package br.com.ddmsoftware.nodegravata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dmoraes on 13/07/2017.
 */

public class CustomItemListBaseAdapter extends BaseAdapter {

    private static ArrayList<TieNode> tieNodes;

    final private LayoutInflater layoutInflater;

    public CustomItemListBaseAdapter(Context context, ArrayList<TieNode> results){

        tieNodes = results;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return tieNodes.size();
    }

    @Override
    public Object getItem(int i) {
        return tieNodes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        CustomHolderView holder;

        if (view==null){

            view = layoutInflater.inflate(R.layout.listview_items,null);

            holder = new CustomHolderView();

            holder.imgTiePicture = view.findViewById(R.id.imgTiePicture);
            holder.tvTieName = view.findViewById(R.id.tvTieTitle);
            //holder.tvTieDescription = (TextView) view.findViewById(R.id.tvTieDescription);

            view.setTag(holder);
        } else {

            holder = (CustomHolderView) view.getTag();

        }

        holder.imgTiePicture.setImageResource(tieNodes.get(i).getNodePicture());
        //holder.imgTiePicture.setImageResource(imgId[tieNodes.get(i).getNodePictureNumber()]);
        holder.tvTieName.setText(tieNodes.get(i).getNodeDescription());
        //holder.tvTieDescription.setText(tieNodes.get(i).getNodeComplement());

        return view;
    }

    static class CustomHolderView {

        TextView tvTieName;
        TextView tvTieDescription;
        ImageView imgTiePicture;
    }
}
