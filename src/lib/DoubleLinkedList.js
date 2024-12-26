class Node {
    constructor(element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedList {
    constructor(){
        this.head = new Node("head");
    }

    find(item) {
        let currentNode = this.head;
        while(currentNode.element !== item) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    insert(newElement, item) {
        let newNode = new Node(newElement);
        let current = this.find(item);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
    }

    display() {
        let currentNode = this.head;
        while(!!currentNode.next) {
            console.log(currentNode.next.element);
            currentNode = currentNode.next;
        }
    }

    findLast() {
        let currentNode = this.head;
        while(!!currentNode.next) {
            currentNode = currentNode.next;
        } 
        return currentNode;
    }

    displayReverse() {
        let currentNode = this.head;
        while(!!currentNode.next) {
            console.log(currentNode.next.element);
            currentNode = currentNode.next;
        }
    }

    remove(item) {
        let currentNode = this.find(item);
        if(!!currentNode.next) {
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
            currentNode.next = null;
            currentNode.prev = null;
        }
    }

}

module.exports = DoubleLinkedList;