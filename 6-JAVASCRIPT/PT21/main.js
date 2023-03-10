$().ready(function (){

    let firstTime = true;
    let equalId = $('#equal').attr('id');
    let resetId = $('#reset').attr('id');
    let delId = $('#del').attr('id');
    let arrNums = [];
    let actualTheme = 1;

    let sumaf = function suma(nums) { 

        return parseFloat(nums[0]) + parseFloat(nums[1]);
    }

    let restaf = function resta(nums) { 
        
        return parseFloat(nums[0]) - parseFloat(nums[1]);
    }

    let diviosonf = function division(nums) { 
        
        return parseFloat(nums[0]) / parseFloat(nums[1]);
    }

    let multf = function mult(nums) { 
        
        return parseFloat(nums[0]) * parseFloat(nums[1]);
    }

    $('button').click(function(){
        if($(this).attr('id') !== equalId && $(this).attr('id') !== resetId && $(this).attr('id') !== delId){
            
            if($(this).hasClass('operation')){
                let indexSuma = $('#screen').text().indexOf('+');
                let indexResta = $('#screen').text().indexOf('-');
                let indexDivision = $('#screen').text().indexOf('/');
                let indexMult = $('#screen').text().indexOf('x');
                if(indexSuma !== -1)
                    console.log('Nice try');
                else if(indexResta !== -1)
                    console.log('Nice try');
                else if(indexDivision !== -1)
                    console.log('Nice try');
                else if(indexMult !== -1)
                    console.log('Nice try');
                else{
                    $('#screen').append($(this).val());
                }

            }else{
                if(firstTime){
                    $('#screen').text($(this).val());
                    firstTime = false;
                }else{
                    $('#screen').append($(this).val());
                }
            }
        }
    });

    $('#equal').click(function () { 
        if($('#screen').text().indexOf('+') !== -1){
                    
            arrNums = $('#screen').text().split('+');
            let suma = sumaf(arrNums);
            $('#screen').text(suma);
        }else if($('#screen').text().indexOf('-') !== -1){
                    
            arrNums = $('#screen').text().split('-');
            let resta = restaf(arrNums);
            $('#screen').text(resta);
        }else if($('#screen').text().indexOf('/') !== -1){
                    
            arrNums = $('#screen').text().split('/');
            let division = divisionf(arrNums);
            $('#screen').text(division);
        }else if($('#screen').text().indexOf('x') !== -1){
                    
            arrNums = $('#screen').text().split('x');
            let mult = multf(arrNums);
            $('#screen').text(mult);
        }
    });
    
    $('#reset').click(()=>{
        $('#screen').text('0');
        firstTime = true;
    });
    
    $('#del').click(()=>{
        $('#screen').text($('#screen').text().slice(0,-1));
    });

    $('#theme_selector_bg').click(function(){
        if(actualTheme == 1){
            $('.theme-1').toggleClass('theme-2');
            $('.theme-2').toggleClass('theme-1');
            actualTheme = 2;
        }else if(actualTheme == 2){
            $('.theme-2').toggleClass('theme-3');
            $('.theme-3').toggleClass('theme-2');
            actualTheme = 3;
        }else{
            $('.theme-3').toggleClass('theme-1');
            $('.theme-1').toggleClass('theme-3');
            actualTheme = 1;
        }
    });
});