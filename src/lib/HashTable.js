function HashTable() {
    this.table = new Array(137);
    this.simpleHash = simpleHash;
    this.showDistro = showDistro;
    this.batterHash = batterHash;
    this.put = put;
}

function simpleHash(data) {
    var total = 0;
    for( var i =0; i< data.length; ++i) {
        total += data.charCodeAt(i);
    }
    return total % this.table.length;
}

// 호너의 메소드 사용. 
// 결과에 소수를 곱하는 과정을 추가
// 
function batterHash(string) {
    const H = 37;
    var total = 0;
    for( var i =0; i< string.length; ++i) {
        total += H * total + string.charCodeAt(i);
    }
    total = total % this.table.length;
    if(total < 0) {
        total += this.table.length -1;
    }

    return parseInt(total);
}


function put(data) {
    var pos = this.batterHash(data);
    this.table[pos] = data;
}

function showDistro() {
    for(var i=0; i < this.table.length ; ++i) {
        if(this.table[i] != undefined) {
            console.log(i + ": " + this.table[i]);
        }
    }
}


var someNames = ["David", "Jenn", "John", "Donnie", "Raymond", "Mike", "Clayton"]

var hTable = new HashTable();

for(var i = 0 ; i < someNames.length ; ++i) {
    hTable.put(someNames[i]);
}

hTable.showDistro();