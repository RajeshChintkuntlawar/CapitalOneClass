let xhr = new XMLHttpRequest();

// on success callback function
xhr.onload = function() {
	let reimbursements = JSON.parse(this.responseText);
	reimbursements.forEach((reimbursement) => {
		document.getElementsByClassName('reimbursement-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		<td>${reimbursement.reimbTypeId}</td>
				<td>${reimbursement.reimbAmount}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${reimbursement.reimbSubmitted}</td>
				<td>${reimbursement.reimbStatusId}</td>
	            <td>${reimbursement.reimbResolved}</td>
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
xhr.open('GET', '../viewPastTickets');

// send the request
xhr.send();