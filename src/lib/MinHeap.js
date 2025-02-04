class MinHeap {
  constructor() {
    this.heap = [];
  }

  push(value) {
    this.heap.push(value);
    this._heapifyUp();
  }

  pop() {
    if (this.heap.length === 0) return null;
    if (this.heap.length === 1) return this.heap.pop();

    const min = this.heap[0];
    this.heap[0] = this.heap.pop();
    this._heapifyDown();
    return min;
  }

  _heapifyUp() {
    let index = this.heap.length - 1;
    while (index > 0) {
      let parentIndex = Math.floor((index - 1) / 2);
      if (this.heap[parentIndex] <= this.heap[index]) {
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
      let smallerChild = leftChild;

      if (
        rightChild < this.heap.length &&
        this.heap[rightChild] < this.heap[leftChild]
      ) {
        smallerChild = rightChild;
      }

      if (this.heap[index] <= this.heap[smallerChild]) {
        break;
      }
      [this.heap[index], this.heap[smallerChild]] = [
        this.heap[smallerChild],
        this.heap[index],
      ];
      index = smallerChild;
    }
  }
}

// ✅ 테스트
const minHeap = new MinHeap();
minHeap.push(3);
minHeap.push(10);
minHeap.push(5);
console.log(minHeap.pop()); // 3 (최소값)
console.log(minHeap.pop()); // 5
console.log(minHeap.pop()); // 10
