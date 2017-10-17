document.getElementsByClassName('outter')[0].addEventListener('click', function(event) {
	console.log('clicked on outter');
	event.stopPropagation();
})

document.getElementsByClassName('middle')[0].addEventListener('click', function(event) {
	console.log('clicked on middle');
	event.stopPropagation();
})

document.getElementsByClassName('inner')[0].addEventListener('click', function(event) {
	console.log('clicked on inner');
	event.stopPropagation();
})






