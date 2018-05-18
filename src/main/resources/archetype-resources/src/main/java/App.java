package $package;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/**
 * Hello JGraphT!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        Graph<String, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
        
        graph.addVertex("v1");
        graph.addVertex("v2");
        graph.addVertex("v3");
        
        graph.addEdge("v1", "v2");
        graph.addEdge("v1", "v3");
        graph.addEdge("v2", "v3");

        for(String v: graph.vertexSet()) { 
            System.out.println("vertex: " + v);
        }
        
        for(DefaultEdge e: graph.edgeSet()) { 
            System.out.println("edge: " + e);
        }
    }
}
