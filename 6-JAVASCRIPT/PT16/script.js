$().ready(() =>{

    $('#red').click(function(){
        $('#toggled').toggleClass('red');
    });
    
    $('#blue').click(function(){
        $('#toggled').toggleClass('blue');
    });
});