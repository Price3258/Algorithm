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

    /*
          23
         /  \
        16   45
        /  \   \
        3   22  37
                  \
                  99 
    */


    expect(bst.root.data).toBe(23);
    const inOrder = bst.inOrder(bst.root);
    const preOrder = bst.preOrder(bst.root);
    const postOrder = bst.postOrder(bst.root);

    bst.printTraversal(inOrder);
    bst.printTraversal(preOrder);
    bst.printTraversal(postOrder);

    expect(inOrder).toStrictEqual([3, 16, 22, 23, 37, 45, 99]);
    expect(preOrder).toStrictEqual([23, 16, 3, 22, 45, 37, 99]);
    expect(postOrder).toStrictEqual([3, 22, 16, 37, 99, 45, 23]);

    expect(bst.getMax()).toBe(99);
    expect(bst.getMin()).toBe(3);

    expect(bst.find(23).left.data).toBe(16);

})