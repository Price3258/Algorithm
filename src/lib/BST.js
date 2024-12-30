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

    inOrder(node, result = []) {
        if (node !== null) {
            this.inOrder(node.left, result);
            result.push(node.show());
            this.inOrder(node.right, result);
        }
        return result;
    }
    
    preOrder(node, result = []) {
        if (node !== null) {
            result.push(node.show());
            this.preOrder(node.left, result);
            this.preOrder(node.right, result);
        }
        return result;
    }
    
    postOrder(node, result = []) {
        if (node !== null) {
            this.postOrder(node.left, result);
            this.postOrder(node.right, result);
            result.push(node.show());
        }
        return result;
    }

    printTraversal(order) {
        console.log(order.join(' '));
    }

    getMin() {
        let current = this.root;
        while (current.left !== null) {
            current = current.left;
        }
        return current.data;
    }
    
    getMax() {
        let current = this.root;
        while (current.right !== null) {
            current = current.right;
        }
        return current.data;
    }

    find(data){
        let current = this.root;

        while(current.data !== data){
            if(data < current.data){
                current = current.left;
            } else {
                current = current.right;
            }
            if(current === null){
                return null;
            }
        }
        return current;
    }
}

module.exports = BST;