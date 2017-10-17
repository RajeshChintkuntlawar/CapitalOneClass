
function bubble(element) {
	element.style.backgroundColor = 'white';
}

function unbubble(element) {
	element.style.backgroundColor = 'green';
}


//document.getElementsByClassName('outter')[0].addEventListener("mouseover", function() {
//	bubble(this);
//})

//document.getElementsByClassName('middle')[0].addEventListener("mouseover", function() {
//	bubble(this);
//})

//document.getElementsByClassName('inner')[0].addEventListener("mouseover", function() {
//	bubble(this);
//})

document.getElementsByClassName('outter')[0].addEventListener("mouseout", function(event) {
//	event.stopPropagation();
	unbubble(this);
})

//document.getElementsByClassName('middle')[0].addEventListener("mouseout", function(event) {
//	event.stopPropagation();
//	unbubble(this);
//})

document.getElementsByClassName('inner')[0].addEventListener("mouseout", function(event) {
//	event.stopPropagation();
	unbubble(this);
})



