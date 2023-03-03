function coinflip(){

    var random = Math.round(Math.random());
    console.log(random);

    return random;
}

var coin = coinflip();

if(coin == 1){
    console.log("Cara");
}else if(coin == 0){
    console.log("Cruz");
}