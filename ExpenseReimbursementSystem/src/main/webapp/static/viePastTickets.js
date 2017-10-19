

function retreiveBankAccounts() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function() {
		
	}

	xhttp.open('GET', '../viewPastTickets');
	xhttp.send();
}

retreiveBankAccounts();