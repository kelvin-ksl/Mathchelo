package com.example.matcheloacademy;

public class ItemListView {

    private String texto;
    private int iconeRid;

    public ItemListView() {
        this("", -1);
    }

    public ItemListView(String texto, int iconeRid) {
        this.texto = texto;
        this.iconeRid = iconeRid;
    }

    public int getIconeRid() {
        return iconeRid;
    }

    public void setIconeRid(int iconeRid) {
        this.iconeRid = iconeRid;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
