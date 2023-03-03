let arr1 = ['🍔','🌯','🍣','🍕','🍜','🍱','🍙','🍘','🥩'];
let aux1 = false;
for(let i = 0; i<arr1.length; i++){
    if(aux1)
        arr1[i]='🍺';
    if(arr1[i]==='🍕'){
        aux1=true;
    }
}
arr1.fill(3,'🍺');
console.table(arr1);

let arr2 = ['🍕','🍕','🍍','🍕','🍕'];
arr2.find(item => {
    if(item === '🍍')
    console.log('Pizza con piña, qué asco');
});
let aux2 = false;
arr2.forEach(emoji=>{
    if(emoji==='🍍')
        aux2=true;
});
if(aux2)
    console.log('Pizza con piña, qué asco');

let arr3 = ['🍕','🍕','🍍','🍕','🍕'];
let aux3 = false;

for(let i = 0; i<arr3.length-1; i++){
    if(arr3[i]==='🍍'){
        aux3 = true;
    }
    if(aux3)
        arr3[i]=arr3[i+1];
}
console.table(arr3);

let arr4 = ['🍓','🍋','🍓','🍋','🍓'];
for(let i = 0; i<arr4.length; i++){
    if(arr4[i] === '🍓')
        arr4[i] = '🍄';
}
console.table(arr4);

let arr5 = ['🌶️','🥛','🌶️','🥛','🌶️','🥛'];
let newArray = arr5.map(function(item) {
    if (item === '🌶️') {
        return item + '🥵';
    } else {
        return item;
    }
});
console.table(newArray);

let arr6 = ['🎴','🎴','🎴','🃏','🎴','🎴','🎴'];
let arrAux = [];
for(let i = 0; i < arr6.length; i++){
    if(i!=arr6.length-1){
        arrAux.push(arr6[i]);
        arrAux.push('🃏');
    }else
        arrAux.push(arr6[i]);
}
console.table(arrAux);