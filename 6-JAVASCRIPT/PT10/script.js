function replacer(string){
    let newString = string.replace(/A/g,"O");
    console.log(newString);
}

function startsBy(string){
    if(string.startsWith("aca")){
        console.log("Empieza por aca");
    }else{
        console.log("No empieza por aca");
    }
}

function repeater(string){
    console.log(string.repeat(3));
}

replacer('GARRA');
startsBy('academia');
startsBy('colegio');
repeater('Hola');