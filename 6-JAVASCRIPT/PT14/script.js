let arr1 = ['ð','ð¯','ð£','ð','ð','ð±','ð','ð','ð¥©'];
let aux1 = false;
for(let i = 0; i<arr1.length; i++){
    if(aux1)
        arr1[i]='ðº';
    if(arr1[i]==='ð'){
        aux1=true;
    }
}
arr1.fill(3,'ðº');
console.table(arr1);

let arr2 = ['ð','ð','ð','ð','ð'];
arr2.find(item => {
    if(item === 'ð')
    console.log('Pizza con piÃ±a, quÃ© asco');
});
let aux2 = false;
arr2.forEach(emoji=>{
    if(emoji==='ð')
        aux2=true;
});
if(aux2)
    console.log('Pizza con piÃ±a, quÃ© asco');

let arr3 = ['ð','ð','ð','ð','ð'];
let aux3 = false;

for(let i = 0; i<arr3.length-1; i++){
    if(arr3[i]==='ð'){
        aux3 = true;
    }
    if(aux3)
        arr3[i]=arr3[i+1];
}
console.table(arr3);

let arr4 = ['ð','ð','ð','ð','ð'];
for(let i = 0; i<arr4.length; i++){
    if(arr4[i] === 'ð')
        arr4[i] = 'ð';
}
console.table(arr4);

let arr5 = ['ð¶ï¸','ð¥','ð¶ï¸','ð¥','ð¶ï¸','ð¥'];
let newArray = arr5.map(function(item) {
    if (item === 'ð¶ï¸') {
        return item + 'ð¥µ';
    } else {
        return item;
    }
});
console.table(newArray);

let arr6 = ['ð´','ð´','ð´','ð','ð´','ð´','ð´'];
let arrAux = [];
for(let i = 0; i < arr6.length; i++){
    if(i!=arr6.length-1){
        arrAux.push(arr6[i]);
        arrAux.push('ð');
    }else
        arrAux.push(arr6[i]);
}
console.table(arrAux);