class Graph {
    constructor(v) {
        this.vertices = v;
        this.edges = 0;
        this.adj = [];
        for (let i = 0; i < this.vertices; i++) {
            this.adj[i] = [];
            this.adj[i].push("");
        }
        this.marked = [];
    }
    addEdge(v, w) {
        this.adj[v].push(w);
        this.adj[w].push(v);
        this.edges++;
    }

    showGraph() {
        for (let i = 0; i < this.vertices; i++) {
          console.log(i + " -> ");
          for (let j = 0; j < this.vertices; j++) {
            if (this.adj[i][j])
                console.log(this.adj[i][j] + ' ');
          }
       }
    }

    dfs(v) {
        this.marked[v] = true;
        if (this.adj[v] != undefined) {
            console.log("Visited vertex: " + v);
        }
        for (let w in this.adj[v]) {
            if (!this.marked[w]) {
                this.dfs(w);
            }
        }
    }
}

module.exports = Graph;