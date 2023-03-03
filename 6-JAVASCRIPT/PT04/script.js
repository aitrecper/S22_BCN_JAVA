const  func = () => {
    return "Aitor Recio Pérez"
}

console.log(func());

function func2(val){
    console.log(val)
}

func2(true);

function infinite(...values){
    values.forEach(value => {
        console.log(value);
    });
}

infinite('Valor 1', 'Valor 2', 'Valor 3', 'Valor 4');