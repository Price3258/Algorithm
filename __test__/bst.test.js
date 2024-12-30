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
    console.log("inOrder traversal: ");
    bst.inOrder(bst.root);
    expect(bst.root.data).toBe(23);
})