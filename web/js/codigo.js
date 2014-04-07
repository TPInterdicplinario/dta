/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//  function prepData(range, amount){
//
//        var arr = new Array(amount);
//            for(var i=0;i<amount;i++){
//            arr[i]=(Math.random()-0.5)*range;
//        }
//            return arr;
//}

//function comenzar(){
    alert("Hola mundo");
//    var myp = new MakeDraw();
//    myp.id="canv";
//    myp.plotColor = 'rgba(200,232,53,1)';
//    myp.gridColor = 'rgba(0,0,0,0,05)';
//    myp.fSize=15;
//    myp.enumerateP=0;
//    myp.enumerateB=0;
//    myp.enumerateV=1;
//
//    var ilosc =200;
//    var data = prepData(10, ilosc);
//
//
//    myp.data = data;
//    myp.plot();
    
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
//    function begin(){
        var ilosc = 200;
        var myp = new MakeDraw();
        var data = prepData(10,ilosc);

        myp.id="canv";
        myp.plotColor ='rgba(200,232,53,1)';
        myp.gridColor ='rgba(0,0,0,0.05)';
        myp.fSize=15;
        myp.enumerateP=0;
        myp.enumerateH=0;
        myp.enumerateV=1;

        var y = setInterval('recalc()',20);
//    }
    
//}