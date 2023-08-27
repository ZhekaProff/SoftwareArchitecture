package ru.zheka.dz1.store3D.models;

import java.util.List;

public class PoligonIModel {
    private List<Poligon> poligins;

    private List<Texture> textures;

    public List<Poligon> getPoligins() {
        return poligins;
    }

    public List<Texture> getTextures() {
        return textures;
    }

    public PoligonIModel(List<Poligon> poligins) {
        this.poligins = poligins;
    }

    public PoligonIModel(List<Poligon> poligins, List<Texture> textures) {
        this.poligins = poligins;
        this.textures = textures;
    }
}
