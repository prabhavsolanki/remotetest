
Q1
function si(){

    var p = prompt('Please enter the principal.');
    var r = prompt('Please enter the Interest Rate.');
    var t = prompt('Please enter the time');
    var amount = p*(1+((r/100)*t))
    
    alert('Total amount is : '+amount);
 
    return false;   
}




Q2
function palindrome() {
    var str = prompt('Please enter the string');
    var len = str.length;
    var mid = Math.floor(len/2);

    for ( var i = 0; i < mid; i++ ) {
        if (str[i] !== str[len - 1 - i]) {
           	alert("Not a palindrome");
		return 0;
        }
    }

    alert("It's a Palindrome");
    return 1;
}





Q3
function area(){
	var r=prompt("PLease enter the radius of the circle");
	var area= 3.14*r*r
	alert("The area of the circle is:"+area);
}

 


Q4
let obj = { 
  a: 1,
  b: { 
    c: 2,
  },
}

let newObj = JSON.parse(JSON.stringify(obj));

obj.b.c = 20;
console.log(obj.b.c);
console.log(newObj.b.c);






Q5
var db=[
  {Name:'alok',Age:21,Salary:70000,DOB:'19-01-2002'},
  {Name:'prabhav',Age:54,Salary:200,DOB:'1-01-2002'},
  {Name:'akshat',Age:23,Salary:50000,DOB:'2-01-2002'},
  {Name:'lakshya',Age:35,Salary:60000,DOB:'17-01-2003'}
  
];
var sal =  db.filter(function(db) {
  return db.Salary > 5000
});

let method1=Object.assign({},sal);

console.log(method1);
//partcc
let group = db.reduce((r, a) => {
 
 r[a.Age] = [...r[a.Age] || [], a];
 return r;
}, {});
console.log("group", group);
//partdd

let increment = [];
for (let k = 0; k< db.length; k++){
	if (db[k].Salary < 1000 && db[k].Age>20){
	let po = db[k].Salary * 5;
	increment.push(po);}}

	console.log(increment);
