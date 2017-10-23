function approve(id) {
	alert(id);
}

let xhr = new XMLHttpRequest();

// on success callback function
xhr.onload = function() {
	let flashcards = JSON.parse(this.responseText);
	flashcards.forEach((flashcard) => {
		document.getElementsByClassName('flashcard-body')[0].innerHTML += `
			<tr id="${flashcard.id}" onClick="approve(${flashcard.id})">
				<td> 
					${flashcard.question}
				</td>
				<td>
					${flashcard.answer}
				</td>
			</tr>
		`;
	})
	
	console.log(this.responseText) 
};

// on fail callback function
xhr.onerror = function() { 
	console.log("failed " + this.responseText) 
};

// specify url and type
xhr.open('GET', '../flashcards');

// send the request
xhr.send();