class MaxHeap {
  constructor() {
    this.heap = [];
  }

  push(value) {
    this.heap.push(value);
    this._heapifyUp();
  }

  pop() {
    if (this.heap.length === 0) {
      return null;
    }
    if (this.heap.length === 1) {
      return this.heap.pop();
    }
    const max = this.heap[0];
    this.heap[0] = this.heap.pop();
    this._heapifyDown();

    return max;
  }

  _heapifyUp() {
    let index = this.heap.length - 1;
    while (index > 0) {
      let parentIndex = Math.floor((index - 1) / 2);
      if (this.heap[parentIndex] >= this.heap[index]) {
        break;
      }
      [this.heap[parentIndex], this.heap[index]] = [
        this.heap[index],
        this.heap[parentIndex],
      ];
      index = parentIndex;
    }
  }

  _heapifyDown() {
    let index = 0;
    while (index * 2 + 1 < this.heap.length) {
      let leftChild = index * 2 + 1;
      let rightChild = index * 2 + 2;
      let largerChild = leftChild;
      if (
        rightChild < this.heap.length &&
        this.heap[rightChild] > this.heap[leftChild]
      ) {
        largerChild = rightChild;
      }
      if (this.heap[index] >= this.heap[largerChild]) {
        break;
      }
      [this.heap[index], this.heap[largerChild]] = [
        this.heap[largerChild],
        this.heap[index],
      ];
      index = largerChild;
    }
  }
}

const maxHeap = new MaxHeap();
maxHeap.push(3);
console.log(maxHeap.heap);
maxHeap.push(10);
console.log(maxHeap.heap);
maxHeap.push(5);
console.log(maxHeap.heap);

console.log(maxHeap.pop()); // 10 (최대값)
console.log(maxHeap.pop()); // 5
console.log(maxHeap.pop()); // 3
