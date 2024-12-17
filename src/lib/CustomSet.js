class CustomSet {

    constructor(data = []) {
        this.items = new Set(data);
    }

    add(value) {
        this.items.add(value)
    }

    delete(value) {
        this.items.delete(value);
    }

    size() {
        return this.items.size;
    }

    has(value) {
        return this.items.has(value);
    }

    values() {
        return [...this.items];
    }

    union(otherSet) {
        return new CustomSet([...this.items , ...otherSet.items]);
    }

    intersection(otherSet) {

        const result = new CustomSet();

        for(const value of this.items) {
            if(otherSet.has(value)) {
                result.add(value);
            }
        }

        return result
    }

    difference(otherSet) {
        const result = new CustomSet();

        for(const value of this.items) {
            if(!otherSet.has(value)) {
                result.add(value);
            }
        }

        return result
    }

    isSubsetOf(otherSet) {
        for(const value of this.items) {
            if(!otherSet.has(value)) {
                return false;
            }
        }

        return true;
    }

}

module.exports = CustomSet;
