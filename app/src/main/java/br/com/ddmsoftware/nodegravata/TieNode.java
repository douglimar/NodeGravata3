package br.com.ddmsoftware.nodegravata;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 12/07/2017.
 */

public class TieNode {

    int nodePicture;
    String nodeDescription;
    String nodeComplement;

    public int getNodePicture(){
        return  nodePicture;
    }

    public void setNodePicture(int nodePicture){
        this.nodePicture = nodePicture;
    }

    public String getNodeComplement() {
        return nodeComplement;
    }

    public void setNodeComplement(String nodeComplement) {
        this.nodeComplement = nodeComplement;
    }


    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    TieNode(int nodePicture, String nodeDescription, String nodeComplement) {
        this.nodePicture = nodePicture;
        this.nodeDescription = nodeDescription;
        this.nodeComplement = nodeComplement;
    }

    TieNode(){

    }


    public List initializeData(Context context) {

        List<TieNode> tieNodes = new ArrayList<>();

        tieNodes.add(new TieNode(R.drawable.rounded_logotipo  , context.getString(R.string.four_in_hand).toString(),""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo2 , context.getString(R.string.half_windsor_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo3 , context.getString(R.string.full_windsor_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo4 , context.getString(R.string.nicky_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo5 , context.getString(R.string.bow_tie_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo6 , context.getString(R.string.kelvin_name),""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo7 , context.getString(R.string.oriental_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo8 , context.getString(R.string.pratt_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo9 , context.getString(R.string.standrew_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo10, context.getString(R.string.balthus_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo11, context.getString(R.string.hanover_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo12, context.getString(R.string.plattsburgh_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo13, context.getString(R.string.granttchester_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo14, context.getString(R.string.victoria_name),""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo2 , context.getString(R.string.café_name),""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo3 , context.getString(R.string.eldredge_name), ""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo4 , context.getString(R.string.trinity_name),""));
        tieNodes.add(new TieNode(R.drawable.rounded_logotipo7 , context.getString(R.string.christensen_name), ""));

        return tieNodes;
    }



}
