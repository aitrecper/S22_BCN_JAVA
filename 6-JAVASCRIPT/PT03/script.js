var $string;
var $number = 123;
var $boolean = true;
var $null = null;
var $undefined = undefined;
var $simbol = Symbol('Algo');
var $array = [1,"hola",false];
var $object = {llave : 'Valor'};
var $function = function saludo(){
    alert('Soy una función');
};

$string = "Hola";

var i = 'global';

function hola(){
    var i = 'local';
    console.log(i);
}
console.log(i);
hola();


console.log(typeof $string + " " + $string);
console.log(typeof $number + " " + $number);
console.log(typeof $boolean + " " + $boolean);
console.log(typeof $null + " " + $null);
console.log(typeof $undefined + " " + $undefined);
//console.log("Simbol " + $simbol);
console.log(typeof $array + " " + $array);
console.log(typeof $object + " " + $object);
console.log(typeof $function + " " + $function);