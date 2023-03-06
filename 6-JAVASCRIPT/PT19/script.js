$().ready(()=>{
    $('.container-3').hide();

    $('#btn_on_off').click(function () {

        if($(this).attr('src') === 'img/boff.jpg'){
            $(this).attr('src', 'img/bon.jpg');
            $('#bulb').attr('src','img/on.jpg');
            $('.container-3').show();
        }else{
            $(this).attr('src', 'img/boff.jpg');
            $('#bulb').attr('src','img/off.jpg');
            $('.container-3').hide();
        }
    });

    function zoom(){
        $('#zoom_label').text(`Light bulb zoom ${$('#zoom').val()}`);
        $('#bulb').attr('width',`${$(this).val()*100}`+'px');
    }

    function light(){
        $('#light_label').text(`Light level ${$(this).val()}`)
        $('#bulb').css('opacity',($(this).val()*10+30)/100);
    }

    $(document).on('input change','#zoom',zoom);
    $(document).on('input change','#light',light);
});