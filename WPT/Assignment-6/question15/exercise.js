var arr=[1,2,3,4,5,6,7,8,9];

function opreation(){

    var arreve=arr.filter(ele=>ele%2);
    arreve=arreve.map(ele=>ele*2);
    var total=arreve.reduce((ele1,ele)=>ele1+ele);
    return total;
}

console.log(opreation());
