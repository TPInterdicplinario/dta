/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    function recalc(){
        var randomJump = Math.random()*10;
        for(var i = 0; i<ilosc;i++){
            data[i-1]=data[i];
        }
        data[ilosc-1]=data[ilosc-2]+Math.random()*1-0.5;
        if(randomJump>8){
            data[ilosc-1]=data[ilosc-2]+Math.random()*10-5;
        }
        myp.data = data;
        myp.plot();
    }

    function prepData(range,amount){
        var arr = new Array(amount);
        for(var i=0;i<amount;i++){
            arr[i]=(Math.random()-0.5)*range;
        }
        return arr;
    }
    
    function castData(list, size){
        var arr = new Array(size);
        for(var i=0;i<size;i++){
            arr[i]=list[i];
        }
        return arr;
    }
        
        