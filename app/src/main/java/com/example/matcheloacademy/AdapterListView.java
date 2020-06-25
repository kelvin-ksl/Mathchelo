package com.example.matcheloacademy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterListView<itemlistview> extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<itemlistview> itens;

    public AdapterListView(Context context, List<itemlistview> itens) {
        //Itens do listview
        this.itens = itens;
        //Objeto responsável por pegar o Layout do item.
        mInflater = LayoutInflater.from(context);
    }
    public int getCount() {
        return itens.size();
    }
    public ItemListView getItem(int position) {
        return (ItemListView) itens.get(position);
    }
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View view, ViewGroup parent) {
        ItemSuporte itemHolder;
        //se a view estiver nula (nunca criada), inflamos o layout nela.
        if (view == null) {
            //infla o layout para podermos pegar as views
            view = mInflater.inflate(R.layout.item_list, null);

            //cria um item de suporte para não precisarmos sempre
            //inflar as mesmas informacoes
            itemHolder = new ItemSuporte();
            itemHolder.txtTitle = ((TextView) view.findViewById(R.id.text));
            itemHolder.imgIcon = ((ImageView) view.findViewById(R.id.imagemview));

            //define os itens na view;
            view.setTag(itemHolder);
        } else {
            //se a view já existe pega os itens.
            itemHolder = (ItemSuporte) view.getTag();
        }

        //pega os dados da lista
        //e define os valores nos itens.
        ItemListView item = (ItemListView) itens.get(position);
        itemHolder.txtTitle.setText(item.getTexto());
        itemHolder.imgIcon.setImageResource(item.getIconeRid());

        //retorna a view com as informações
        return view;
    }

    /**
     * Classe de suporte para os itens do layout.
     */
    private class ItemSuporte {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
