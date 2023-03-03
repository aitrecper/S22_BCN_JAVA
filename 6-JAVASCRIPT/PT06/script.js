function suma(num1, num2, num3){
    return num1 + num2 + num3;
}

function concat(name,surn1,surn2){
    console.log(`${name} ${surn1} ${surn2}`);
}

function higher(num1,num2){
    if(num1 > num2){
        return num1;
    }else if(num1 < num2){
        return num2;
    }else{
        return "Son iguales";
    }
}
console.log(suma(1,2,3));
concat("Aitor", "Recio", "Pérez");
console.log(`El mayor número es ${higher(1,2)}`);