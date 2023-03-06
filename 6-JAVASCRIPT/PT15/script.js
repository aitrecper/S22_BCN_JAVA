let arr = [];
let emoji_random=['🍺','🔥','🕹️','💎','💡','🔑','✔️','🪕','🗿'];
let insertAtNum = document.getElementById('btn_insert_num').value;
let removeAtNum = document.getElementById('btn_remove_num').value;
let arrayDiv = document.getElementById('array_div');

let btnPush = document.getElementById('btn_push');

let btnUnshift = document.getElementById('btn_unshift');
let btnInsert = document.getElementById('btn_insert');
let btnPop = document.getElementById('btn_pop');
let btnShift = document.getElementById('btn_shift');
let btnRemove = document.getElementById('btn_remove');

function printArray(){
    arrayDiv.innerHTML = `[${arr}]`;
}

function randomGenerator(){
    let random = Math.round(Math.random()*9);

    return random;
}

function push(){
    arr.push(emoji_random[randomGenerator()]);
    console.table(arr);
    printArray();
}

function unshift(){
    arr.unshift(emoji_random[randomGenerator()]);
    console.table(arr);
    printArray();
}

function insert(){
    arr.splice(insertAtNum,0,emoji_random[randomGenerator()]);
    console.table(arr);
    printArray();
}

function pop(){
    arr.pop();
    console.table(arr);
    printArray();
}

function shift(){
    arr.shift();
    console.table(arr);
    printArray();
}

function remove(){
    arr.splice(removeAtNum, 1);
    console.table(arr);
    printArray();
}

// btnPush.addEventListener("click", push());
// btnUnshift.addEventListener("click", unshift());
// btnInsert.addEventListener("click", insert());
// btnPop.addEventListener("click", pop());
// btnShift.addEventListener("click", shift());
// btnRemove.addEventListener("click", remove());