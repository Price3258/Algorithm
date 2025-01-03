const PriorityQueue = require("../src/lib/PriorityQueue");

it("priority queue test", () => {
    const pq = new PriorityQueue();

    pq.enqueue("A", 1);
    pq.enqueue("B", 2);
    pq.enqueue("C", 3);
    pq.enqueue("D", 4);
    pq.enqueue("E", 7);
    pq.enqueue("F", 6);
    pq.enqueue("G", 5);

    expect(pq.dequeue()).toStrictEqual({element: "A", priority: 1});
    expect(pq.dequeue()).toStrictEqual({element: "B", priority: 2});
    expect(pq.dequeue()).toStrictEqual({element: "C", priority: 3});
    expect(pq.dequeue()).toStrictEqual({element: "D", priority: 4});
    expect(pq.dequeue()).toStrictEqual({element: "G", priority: 5});
    expect(pq.dequeue()).toStrictEqual({element: "F", priority: 6});
    expect(pq.dequeue()).toStrictEqual({element: "E", priority: 7});
    
});
