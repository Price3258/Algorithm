const Queue = require("../src/lib/Queue");

it("queue test", () => {
    const queue = new Queue();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    expect(queue.front()).toBe(1);
    expect(queue.back()).toBe(5);

    expect(queue.dataToString()).toBe("1\n2\n3\n4\n5\n");

    queue.dequeue();
    expect(queue.front()).toBe(2);
    expect(queue.dataToString()).toBe("2\n3\n4\n5\n");

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    expect(queue.isEmpty()).toBe(true);
});
