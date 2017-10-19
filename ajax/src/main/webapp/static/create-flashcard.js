

function submit() {
	let xhr = new XMLHttpRequest();

	// on success callback function
	xhr.onload = function() {
		console.log(this.responseText) 
		location.href = "./flashcards.html"
	};

	// on fail callback function
	xhr.onerror = function() { 
		console.log("failed " + this.responseText) 
	};
	
	let flashcard = { id: 0};
	
	flashcard.question = document.getElementById('new-question').value;
	flashcard.answer = document.getElementById('new-answer').value;
	
	// specify url and type
	xhr.open('POST', '../flashcards');

	// send the request
	xhr.send(JSON.stringify(flashcard));
}

