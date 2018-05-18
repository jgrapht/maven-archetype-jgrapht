package $package;

import static org.junit.Assert.assertEquals;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void basic()
    {
        Graph<String, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
        
        graph.addVertex("v1");
        graph.addVertex("v2");
        graph.addVertex("v3");
        
        graph.addEdge("v1", "v2");
        graph.addEdge("v1", "v3");
        graph.addEdge("v2", "v3");
        
        assertEquals(3, graph.vertexSet().size());
        assertEquals(3, graph.edgeSet().size());
        
        assertEquals(2, graph.outDegreeOf("v1"));
        assertEquals(1, graph.outDegreeOf("v2"));
        assertEquals(0, graph.outDegreeOf("v3"));
    }
}
