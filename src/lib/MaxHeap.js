class MaxHeap {
  constructor() {
    this.heap = [];
  }

  push(value) {
    this.heap.push(value);
    this._heapifyUp();
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
}

const maxHeap = new MaxHeap();
maxHeap.push(3);
console.log(maxHeap.heap);
maxHeap.push(10);
console.log(maxHeap.heap);
maxHeap.push(5);
console.log(maxHeap.heap);

// console.log(maxHeap.pop()); // 10 (최대값)
// console.log(maxHeap.pop()); // 5
// console.log(maxHeap.pop()); // 3
