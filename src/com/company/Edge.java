package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Edge {

    private String label;
    List<Vertices> vertices = new ArrayList<>();

    public Edge(String label){
        this.label = label;
    }

    public List<Vertices> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertices> vertices) {
        this.vertices = vertices;
    }

    public String getLabel() {
        return label;
    }
}
