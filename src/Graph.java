public class Graph {
    private final int MAX_VERTS = 20;
    private final int INFINITY = 1000000;
    private Vertex vertexList[]; // list of vertices
    private int adjMat[][]; // adjacency matrix
    private int nVerts; // current number of vertices
    private int nTree; // number of verts in tree
    private DistPar sPath[]; // array for shortest-path data
    private int currentVert; // current vertex
    private int startToCurrent; // distance to currentVert

    public Graph() // constructor
    {
        vertexList = new Vertex[MAX_VERTS];
        // adjacency matrix
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        nTree = 0;
        for(int j=0; j<MAX_VERTS; j++) // set adjacency
            for(int k=0; k<MAX_VERTS; k++) // matrix
                adjMat[j][k] = INFINITY; // to infinity
        sPath = new DistPar[MAX_VERTS]; // shortest paths
    } // end constructor

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end, int weight)
    {
        adjMat[start][end] = weight; // (directed)
    }

    public void showAdjMatrix(){
        for(int i = -1; i < nVerts; i++){
            for(int j = -1; j < nVerts-1; j++){
                if (i < 0)
                    System.out.print("  " + vertexList[j+1].label);
                else{
                    if (adjMat[i][j +1] < INFINITY) {
                        if (adjMat[i][j+1] > 9)
                            System.out.print(adjMat[i][j + 1] + " ");
                        else
                            System.out.print(adjMat[i][j + 1] + "  ");
                    }
                    else
                        System.out.print("0  ");
                }
            }
            System.out.print('\n');
            if (i < nVerts -1)
                System.out.print(vertexList[i+1].label + " ");
        }
    }

    public void shortestPath(){
        for(int i = 0; i < nVerts; i++){
            for(int j = 0; j < nVerts; j++){
                for(int k = 0; k < nVerts; k++){
                    if (adjMat[j][k] > adjMat[j][i] + adjMat[i][k] && j != k){
                        adjMat[j][k] = adjMat[j][i] + adjMat[i][k];
                    }
                }
            }
        }
    }



}
