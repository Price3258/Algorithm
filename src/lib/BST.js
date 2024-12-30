class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    show() {
        return this.data;
    }
}

class BST {
    constructor() {
        this.root = null;
    }

    insert(data) {
        let newNode = new Node(data);
        if (this.root === null) {
            this.root = newNode;
        } else {
           let current = this.root;
           let parent;
           while (true) {
               parent = current;
               if (data < current.data) { // 현재 데이터보다 작으면 왼쪽
                   current = current.left;
                   if (current === null) {
                       parent.left = newNode;
                       break;
                   }
               } else {
                   current = current.right; // 크면 오른쪽
                   if (current === null) {
                       parent.right = newNode;
                       break;
                   }
               }
           }
        }
    }

    inOrder(node) {
        if (node !== null) {
            this.inOrder(node.left);
            console.log(node.show());
            this.inOrder(node.right);
        }
    }
}

module.exports = BST;