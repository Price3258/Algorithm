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

    getSmallestNode(node){  // 가장 작은 노드 찾기
        if(node.left === null){
            return node;
        } else {
            return this.getSmallestNode(node.left);
        }
    }

    remove(data){
        this.root = this.removeNode(this.root, data);
    }

    removeNode(node, data){
        if(node === null){
            return null;
        }
        if(data === node.data){
            // **Case 1: 리프 노드**
        if (node.left === null && node.right === null) {
            return null; // 현재 노드 제거
        }

        // **Case 2: 하나의 자식만 있는 경우**
        if (node.left === null) {
            return node.right; // 오른쪽 자식 반환
        }
        if (node.right === null) {
            return node.left; // 왼쪽 자식 반환
        }
        // **Case 3: 두 개의 자식이 있는 경우**
        // 오른쪽 서브트리에서 가장 작은 값을 가져옴
        let tempNode = this.getSmallestNode(node.right);
        node.data = tempNode.data;
        node.right = this.removeNode(node.right, tempNode.data);
        return node;
        } else if(data < node.data){
            node.left = this.removeNode(node.left, data);
            return node;
        } else {
            node.right = this.removeNode(node.right, data);
            return node;
        }
    }
}

module.exports = BST;