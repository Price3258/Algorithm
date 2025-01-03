const Graph = require('../src/lib/Graph');

it("graph test", () => {
    const graph = new Graph(5);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 4);
    graph.showGraph();
    expect(graph.vertices).toBe(5);
    expect(graph.edges).toBe(4);
    expect(graph.adj[0]).toEqual([ '', 1, 2 ]);
    expect(graph.adj[1]).toEqual([ '', 0, 3 ]);
    expect(graph.adj[2]).toEqual([ '', 0, 4 ]);
    expect(graph.adj[3]).toEqual([ '', 1 ]);
    expect(graph.adj[4]).toEqual([ '', 2 ]);

    // console.log(graph);
    // Graph {
    //     vertices: 5,
    //     edges: 4,
    //     adj: [
    //       [ '', 1, 2 ],
    //       [ '', 0, 3 ],
    //       [ '', 0, 4 ],
    //       [ '', 1 ],
    //       [ '', 2 ]
    //     ]
    //   }

})