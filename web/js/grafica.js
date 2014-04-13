/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    function recalc(data, temp, size){
        for(var i = 0; i<size;i++){
            data[i-1]=data[i];
        }
        data[size-1]=temp;
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
        
        