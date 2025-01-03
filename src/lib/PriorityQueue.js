class PriorityQueue {
    constructor() {
        this.dataStore = [];
    }

    enqueue(element, priority) {
        let obj = {element, priority};
        let added = false;
        for (let i = 0; i < this.dataStore.length; i++) {
            if (priority < this.dataStore[i].priority) {
                this.dataStore.splice(i, 0, obj);
                added = true;
                break;
            }
        }
        if (!added) {
            this.dataStore.push(obj);
        }
    }

    dequeue() {
        return this.dataStore.shift();
    }
  
    front() {
        return this.dataStore[0];
    }
    back() {
        return this.dataStore[this.dataStore.length-1];
    }
    dataToString() {
        let retStr = "";
        for (let i = 0; i < this.dataStore.length; i++) {
            retStr += this.dataStore[i].element + "\n";
        }
        return retStr;
    }
    
    isEmpty() {
        return this.dataStore.length === 0
    }
}

module.exports = PriorityQueue;