let xhr = new XMLHttpRequest();

// on success callback function
xhr.onload = function() {
	let reimbursements = JSON.parse(this.responseText);
	reimbursements.forEach((reimbursement) => {
		document.getElementsByClassName('allrequests-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		<td>${reimbursement.reimbTypeId}</td>
				<td>$${reimbursement.reimbAmount}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${reimbursement.reimbSubmitted}</td>
				<td>${reimbursement.reimbAuthor}</td>
				<td>${reimbursement.reimbStatusId}</td>
	            <td><button type="button" name="approve" onclick="approve(${reimbursement.reimbId})">Approve</button></td>
	            <td><button type="button" onclick="deny(${reimbursement.reimbId})">Deny</button></td>
			</tr>
		`;
	})
	
	console.log(this.responseText) 
};

function approve(id) {
	console.log(id);
}

function deny(id) {
	console.log(id);
}

// on fail callback function
xhr.onerror = function() { 
	console.log("failed " + this.responseText) 
};

// specify url and type
xhr.open('GET', '../viewAllRequests');

// send the request
xhr.send();