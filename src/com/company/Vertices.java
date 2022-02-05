package com.company;
public class Vertices {

    private int distance;
    private Edge edge1;
    private Edge edge2;

    public Vertices(int distance){
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Edge getEdge1() {
        return edge1;
    }

    public void setEdge1(Edge edge1) {
        this.edge1 = edge1;
    }

    public Edge getEdge2() {
        return edge2;
    }

    public void setEdge2(Edge edge2) {
        this.edge2 = edge2;
    }
}
