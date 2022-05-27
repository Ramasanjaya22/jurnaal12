package com.isd;

import java.util.LinkedList;

public class Graph{
    int currentIndex = 0;
    Character[] vertex;
    LinkedList<Character> adjencyList[];

    //constructor
    public Graph(int sizeArray){
        vertex = new Character[sizeArray];
        adjencyList= new LinkedList[sizeArray];

        for (int i = 0; i < sizeArray; i++) { //menyimpan
            adjencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(Character src, Character dest) {
        if (vertex[currentIndex] != src && vertex[currentIndex] != null) {
            this.currentIndex++;
        }
        vertex[currentIndex] = src;
        adjencyList[currentIndex].add(dest);
    }

    public void printGraph() {
        for (int i = 0; i < vertex.length; i++) {
            if (adjencyList[i].size() > 0) {
                System.out.print("node(vertex) " + vertex[i] + " terhubung ke : ");
                for (int j = 0; j < adjencyList[i].size(); j++) {
                    System.out.print(adjencyList[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge('A','B');
        graph.addEdge('A','D');
        graph.addEdge('A','E');
        graph.addEdge('B','E');
        graph.addEdge('C','B');
        graph.addEdge('D','G');
        graph.addEdge('E','F');
        graph.addEdge('E','H');
        graph.addEdge('F','C');
        graph.addEdge('F','H');
        graph.addEdge('G','H');
        graph.addEdge('H','I');
        graph.addEdge('I','F');
        graph.printGraph();
    }
}

