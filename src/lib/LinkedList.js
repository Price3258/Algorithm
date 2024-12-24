class Node {
    constructor(element) {
        this.element = element;
        this.next = null;
    }
}

class LinkedList {
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
        current.next = newNode;
    }

    display() {
        let currentNode = this.head;
        while(!!currentNode.next) {
            console.log(currentNode.next.element);
            currentNode = currentNode.next;
        }
    }

    remove(item) {
        let currentNode = this.head;

        while (currentNode.next !== null) {
            if (currentNode.next.element === item) {
                currentNode.next = currentNode.next.next; // 다음 노드를 건너뛰어 삭제
                return;
            }
            currentNode = currentNode.next;
        }

        console.log("Item not found.");
    }

}

module.exports = LinkedList;