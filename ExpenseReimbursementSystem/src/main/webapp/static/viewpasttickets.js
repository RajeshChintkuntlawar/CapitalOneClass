let xhr = new XMLHttpRequest();

// on success callback function
xhr.onload = function () {
	let reimbursements = JSON.parse(this.responseText);

	reimbursements.forEach((reimbursement) => {
		if (reimbursement.reimbResolved === null) {
			document.getElementsByClassName('reimbursement-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		        <td>${reimbursement.reimbType}</td>
                <td>$${reimbursement.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g, '$1,')}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${new Date(reimbursement.reimbSubmitted).toString().substring(4, 15)}</td>
				<td>${reimbursement.reimbStatusId}</td>
				<td>${reimbursement.reimbResolver}</td>
				</tr>
				`;
		} else {
			document.getElementsByClassName('reimbursement-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		        <td>${reimbursement.reimbType}</td>
                <td>$${reimbursement.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g, '$1,')}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${new Date(reimbursement.reimbSubmitted).toString().substring(4, 15)}</td>
				<td>${reimbursement.reimbStatusId}</td>
				<td>${reimbursement.reimbResolver}</td>
				<td>${new Date(reimbursement.reimbResolved).toString().substring(4, 15)}</td>  
			</tr>
		`;
		}
	})

	// console.log(this.responseText)
};

// on fail callback function
xhr.onerror = function () {
	console.log("failed " + this.responseText)
};

// specify url and type
xhr.open('GET', '../viewPastTickets');

// send the request
xhr.send();