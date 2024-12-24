const LinkedList = require("../src/lib/LinkedList");

it("linkedList test", () => {
    const cities = new LinkedList();

    cities.insert("Conway", "head");
    cities.insert("Russellville", "Conway");
    cities.insert("Alma", "Russellville");

    console.log(cities.display());
    
    cities.remove("Russellville");
    console.log(cities.display());
 
})