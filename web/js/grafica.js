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

    function prepRandomData(range,amount){
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
     
    function staticPlot(data){        
        myp.data = data;
        myp.plot();
    }
    
    function dynamicPlot(data, size){
        alert(data);
        recalc(myp.data, data, size);
    }
    
    var myp = new MakeDraw();   
    myp.id = "canv";
    myp.plotColor = 'green';
    myp.gridColor = 'rgba(0,0,0,0.05)';
    myp.fSize = 15;
    myp.enumerateP = 1;
    myp.enumerateH = 0;
    myp.enumerateV = 1;