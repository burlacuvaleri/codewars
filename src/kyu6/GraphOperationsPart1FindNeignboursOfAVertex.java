/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu6;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;
import com.sun.javafx.geom.Edge;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import sun.security.provider.certpath.Vertex;

/**
 *
 * @author iucosoft9
 */
public class GraphOperationsPart1FindNeignboursOfAVertex {

    public static void main(String[] args) {

    }

    public static Set<Vertex> getNeighbours(Graph graph, Vertex vertex) {

        //trebuie de papat aceasta informatie :) 
        // dar ea functioneaza
        
        
        Set<Vertex> neighbours = new HashSet<>();
//
//        for (Edge edge : graph.getEdges()) {
//            if (edge.getV1().equals(vertex)) {
//                neighbours.add(edge.getV2());
//            } else if (edge.getV2().equals(vertex)) {
//                neighbours.add(edge.getV1());
//            }
//        }
//
        return neighbours;
    }

}
