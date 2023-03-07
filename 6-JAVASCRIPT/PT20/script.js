$().ready(() =>{

    let eatValue = parseInt($('#eat_progress').val());
    let playValue = parseInt($('#play_progress').val());
    let fightValue = parseInt($('#fight_progress').val());
    let sleepValue = parseInt($('#sleep_progress').val());
    let happinessValue = parseInt($('#happiness_progress').val());
    let heartsCounter = 0;

    function setEatValue(eatValue){
        
        if(eatValue<=100 && eatValue > 0){
            $('#eat_progress').val(eatValue);
            $('#eat_progress_pc').text(`${eatValue}% Full`);
        }else if(eatValue>100){
            eatValue = 100;
            $('#eat_progress').val(eatValue);
            $('#eat_progress_pc').text(`${eatValue}% Full`);
        }else if(eatValue < 0){
            eatValue = 0;
            $('#eat_progress').val(eatValue);
            $('#eat_progress_pc').text(`${eatValue}% Full`);
        }
        return eatValue;
    }

    function setPlayValue(playValue){
        if(playValue<=100 && playValue > 0){
            $('#play_progress').val(playValue);
            $('#play_progress_pc').text(`${playValue}% Fun`);
        }else if(playValue>100){
            playValue = 100;
            $('#play_progress').val(playValue);
            $('#play_progress_pc').text(`${playValue}% Fun`);
        }else if(playValue < 0){
            playValue = 0;
            $('#play_progress').val(playValue);
            $('#play_progress_pc').text(`${playValue}% Fun`);
        }
        return playValue;
    }

    function setFightValue(fightValue){
        if(fightValue<=100 && fightValue > 0){
            $('#fight_progress').val(fightValue);
            $('#fight_progress_pc').text(`${fightValue}% Strength`);
        }else if(fightValue>100){
            fightValue = 100;
            $('#fight_progress').val(fightValue);
            $('#fight_progress_pc').text(`${fightValue}% Strength`);
        }else if(fightValue < 0){
            fightValue = 0;
            $('#fight_progress').val(fightValue);
            $('#fight_progress_pc').text(`${fightValue}% Strength`);
        }
        return fightValue;
    }

    function setSleepValue(sleepValue){
        if(sleepValue<=100 && sleepValue > 0){
            $('#sleep_progress').val(sleepValue);
            $('#sleep_progress_pc').text(`${sleepValue}% Strength`);
        }else if(sleepValue>100){
            sleepValue = 100;
            $('#sleep_progress').val(sleepValue);
            $('#sleep_progress_pc').text(`${sleepValue}% Strength`);
        }else if(sleepValue < 0){
            sleepValue = 0;
            $('#sleep_progress').val(sleepValue);
            $('#sleep_progress_pc').text(`${sleepValue}% Strength`);
        }
        return sleepValue;
    }
    
    function setHappinessValue(happinessValue){
        if(happinessValue<=100 && happinessValue > 0){
            $('#happiness_progress').val(happinessValue);
            $('#happiness_progress_pc').text(`Happiness: ${happinessValue}%`);
        }else if(happinessValue > 100){
            happinessValue-=100;
            $('#happiness_progress').val(happinessValue);
            $('#happiness_progress_pc').text(`Happiness: ${happinessValue}%`);
            heartsCounter++;
            $('#hearts').append('❤');
        }else if (happinessValue<0){
            happinessValue = 0;
            $('#hearts').empty();
            for(let i; i<heartsCounter; i++)
                $('#hearts').append('❤');
            $('#happiness_progress').val(happinessValue);
            $('#happiness_progress_pc').text(`Happiness: ${happinessValue}%`);
        }
        return happinessValue;
    }

    $('#ice_cream').click(function (){
        if( eatValue< 100 && fightValue > 0){
            eatValue+=10;
            fightValue-=30;
            happinessValue+=30;
            sleepValue-=10;
            eatValue = setEatValue(eatValue);
            fightValue = setFightValue(fightValue);
            happinessValue = setHappinessValue(happinessValue);
            sleepValue = setSleepValue(sleepValue);
        }
    });

    $('#carrot').click(function (){
        if( eatValue< 100 && fightValue < 100){
            eatValue+=20;
            fightValue+=10;
            happinessValue-=20;
            sleepValue-=10;
            eatValue = setEatValue(eatValue);
            fightValue = setFightValue(fightValue);
            happinessValue = setHappinessValue(happinessValue);
            sleepValue = setSleepValue(sleepValue);
        }
    });

    $('#thight').click(function (){
        if( eatValue< 100 && fightValue < 100){
            eatValue+=40;
            fightValue+=10;
            sleepValue-=10;
            eatValue = setEatValue(eatValue);
            fightValue = setFightValue(fightValue);
            sleepValue = setSleepValue(sleepValue);
        }
    });

    $('#controller').click(function (){
        if( playValue < 100 && fightValue > 0){
            playValue+=20;
            fightValue-=20;
            happinessValue+=20;
            playValue = setPlayValue(playValue);
            fightValue = setFightValue(fightValue);
            happinessValue = setHappinessValue(happinessValue);
        }
    });

    $('#us_football').click(function (){
        if( playValue < 100 && fightValue < 100 && sleepValue > 0){
            playValue+=40;
            fightValue+=20;
            happinessValue-=10;
            sleepValue-=30;
            eatValue-=30;
            eatValue = setEatValue(eatValue);
            playValue = setPlayValue(playValue);
            fightValue = setFightValue(fightValue);
            happinessValue = setHappinessValue(happinessValue);
            sleepValue = setSleepValue(sleepValue);
        }
    });

    $('#chess').click(function (){
        if( playValue < 100 && fightValue > 0){
            playValue+=30;
            fightValue-=10;
            happinessValue+=10;
            playValue = setPlayValue(playValue);
            fightValue = setFightValue(fightValue);
            happinessValue = setHappinessValue(happinessValue);
        }
    });
});