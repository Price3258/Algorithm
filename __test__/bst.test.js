const BST = require("../src/lib/BST");

it("bst test", () => {
    const bst = new BST();

    bst.insert(23);
    bst.insert(45);
    bst.insert(16);
    bst.insert(37);
    bst.insert(3);
    bst.insert(99);
    bst.insert(22);
    bst.insert(33);
    bst.insert(32);
    bst.insert(88);
    bst.insert(38);
    bst.insert(8);

    /*
    *         23
    *       /    \
    *    16      45
    *  /  \    /     \
    *  3  22  37      99
    *    /    /  \    /
    *  8   33  38  88
    *         /
    *      32
    * 
    */


    expect(bst.root.data).toBe(23);
    const inOrder = bst.inOrder(bst.root);
    const preOrder = bst.preOrder(bst.root);
    const postOrder = bst.postOrder(bst.root);

    bst.printTraversal(inOrder);
    bst.printTraversal(preOrder);
    bst.printTraversal(postOrder);

    expect(inOrder).toStrictEqual([3, 8, 16, 22, 23, 32, 33 ,37, 38, 45, 88, 99]);
    expect(preOrder).toStrictEqual([23, 16, 3, 8, 22, 45, 37, 33, 32, 38, 99, 88]);
    expect(postOrder).toStrictEqual([8, 3, 22, 16, 32, 33,38, 37, 88, 99, 45, 23]);

    expect(bst.getMax()).toBe(99);
    expect(bst.getMin()).toBe(3);

    expect(bst.find(23).left.data).toBe(16);

    bst.remove(16);

})