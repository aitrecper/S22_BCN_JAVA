$().ready(()=>{

    let roundNum = 0;
    let random;
    let playerName = prompt("Inserta tu nombre:");
    let options = ['⛰️','📄','✂️'];
    let playerScore = 0;
    let computerScore = 0;

    function computerPlay(){
        random = Math.round(Math.random()*3);
    }

    function checkWinner(userPlay, computerPlay){

        console.log(`roundNum ${roundNum}`)

        if(userPlay == computerPlay){
            console.log("Empate");
            return "Empate";
        }else if(userPlay == 0 && computerPlay == 2){
            playerScore++;
            console.log("Gana el jugador");
            return "Gana el jugador";
        }else if(userPlay == 0 && computerPlay == 1){
            computerScore++;
            console.log("Gana el ordenador");
            return 'Gana el ordenador';
        }else if(userPlay == 1 && computerPlay == 2){
            computerScore++;
            console.log("Gana el ordenador");
            return 'Gana el ordenador';
        }else if(userPlay == 1 && computerPlay == 0){
            playerScore++;
            console.log("Gana el jugador");
            return "Gana el jugador";
        }else if(userPlay == 2 && computerPlay == 0){
            computerScore++;
            console.log("Gana el ordenador");
            return 'Gana el ordenador';
        }else if(userPlay == 2 && computerPlay == 1){
            playerScore++;
            console.log("Gana el jugador");
            return "Gana el jugador";
        }
    }

    function endRound(playerPlay,computerPlay, result){
        $('#game').append(`Ronda número: ${roundNum + 1}<br>`);
        $('#game').append(`✅ ${playerName}: ${options[playerPlay]}<br>`);
        $('#game').append(`✅ Ordenador: ${options[computerPlay]}<br>`);
        $('#game').append(`${options[playerPlay]} VS ${options[computerPlay]} : ${result}<br>`);
        $('#game').append(`Puntuación: ${playerName}: ${playerScore} - ${computerScore} Ordenador<br>`);
    }

    $('#rock').click(()=>{
        console.log("Entro a rock");
        if(playerScore < 3 && computerScore < 3){
            console.log("Entro a rock y hago jugada");
            let playerOption = parseInt($('#rock').val());
            console.log(`playerOption ${playerOption}`);
            computerPlay();
            let result = checkWinner(playerOption,random);
            endRound(playerOption,random,result);
            roundNum++;
        }
    });

    $('#paper').click(()=>{
        if(playerScore < 3 && computerScore < 3){
            let playerOption = parseInt($('#paper').val());
            computerPlay();
            let result = checkWinner(playerOption,random);
            endRound(playerOption,random,result);
            roundNum++;
        }
    });

    $('#scissors').click(()=>{
        if(playerScore < 3 && computerScore < 3){
            let playerOption = parseInt($('#scissors').val());
            computerPlay();
            let result = checkWinner(playerOption,random);
            endRound(playerOption,random,result);
            roundNum++;
        }
    });
});