public class GraphTest {
    public static void main(String[] args){
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0 (start)
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4

        theGraph.addEdge(0, 1, 50); // AB 50
        theGraph.addEdge(0, 3, 80); // AD 80
        theGraph.addEdge(1, 2, 60); // BC 60
        theGraph.addEdge(1, 3, 90); // BD 90
        theGraph.addEdge(2, 4, 40); // CE 40
        theGraph.addEdge(3, 2, 20); // DC 20
        theGraph.addEdge(3, 4, 70); // DE 70
        theGraph.addEdge(4, 1, 50); // EB 50

        System.out.println("BEFORE: ");
        theGraph.showAdjMatrix();

        System.out.println("AFTER: ");
        theGraph.shortestPath();
        theGraph.showAdjMatrix();

        /*Graph g = new Graph();

        g.addVertex('a'); //0
        g.addVertex('b'); //1
        g.addVertex('c'); //2
        g.addVertex('d'); //3
        g.addVertex('e'); //4
        g.addVertex('f'); //5
        g.addVertex('g'); //6
        g.addVertex('h'); //7

        g.addEdge(0,1, 4); //ab 4
        g.addEdge(0,7, 4); //ah 4
        g.addEdge(0,6, 7); //ag 7

        g.addEdge(1,7, 1); //bh 1
        g.addEdge(1,2, 9); //bc 9
        g.addEdge(1,5, 6); //bf 6
        g.addEdge(1,6, 8); //bg 8

        g.addEdge(2,4, 10); //ce 10

        g.addEdge(4,2, 8); //ec 8
        g.addEdge(4,3, 6); //ed 6
        g.addEdge(4,5, 5); //ef 5

        g.addEdge(5,4, 6); //fe 6

        g.addEdge(6,1, 4); //gb 4
        g.addEdge(6,5, 7); //gf 7

        g.addEdge(7, 2, 3); //hc 3

        g.floyds();
        g.showAdjMatrix();*/




    }
}
