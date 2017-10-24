allReimbursements();
function allReimbursements() {
    let xhr = new XMLHttpRequest();

    // on success callback function
    xhr.onload = function () {
        let reimbursements = JSON.parse(this.responseText);
        document.getElementsByClassName('allrequests-body')[0].innerHTML = ` `;
        reimbursements.forEach((reimbursement) => {
            if (reimbursement.reimbStatusId !== "PENDING") {
                document.getElementsByClassName('allrequests-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		        <td>${reimbursement.reimbType}</td>
				<td>$${reimbursement.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g, '$1,')}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${new Date(reimbursement.reimbSubmitted).toString().substring(4, 15)}</td>
				<td>${reimbursement.reimbAuthor}</td>
				<td>${reimbursement.reimbStatusId}</td>
			</tr>
		`;
            } else {
                document.getElementsByClassName('allrequests-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		        <td>${reimbursement.reimbType}</td>
				<td>$${reimbursement.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g, '$1,')}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${new Date(reimbursement.reimbSubmitted).toString().substring(4, 15)}</td>
				<td>${reimbursement.reimbAuthor}</td>
				<td>${reimbursement.reimbStatusId}</td>
	            <td>
	            <button class='btn btn-success' onclick="approveDeny(${reimbursement.reimbId}, 'Approve'), afterUpdate()">Approve</button>
	            <button class='btn btn-danger' onclick="approveDeny(${reimbursement.reimbId}, 'Deny'), afterUpdate()">Deny</button>
	            </td>
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
    xhr.open('GET', '../viewAllRequests');

    // send the request
    xhr.send();
}

function approveDeny(id, value) {
    
        let xhr = new XMLHttpRequest();
    
        // on fail callback function
        xhr.onerror = function () {
            console.log("failed " + id);
        };
    
        // specify url and type
        xhr.open('POST', '../updateDenyRequest');
    
        // send the request
        xhr.send(JSON.stringify(id + "," + value));
}

function afterUpdate() {
	window.alert("Ticket Status Updated");
    window.location.href='../static/viewAllRequests.html';    
}

function retrievePendingTickets() {
    let xhr = new XMLHttpRequest();

    // on success callback function
    xhr.onload = function () {
        let reimbursements = JSON.parse(this.responseText);
        document.getElementsByClassName('allrequests-body')[0].innerHTML = ` `;
        reimbursements.forEach((reimbursement) => {
            if (reimbursement.reimbStatusId === "PENDING") {
                document.getElementsByClassName('allrequests-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		        <td>${reimbursement.reimbType}</td>
				<td>$${reimbursement.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g, '$1,')}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${new Date(reimbursement.reimbSubmitted).toString().substring(4, 15)}</td>
				<td>${reimbursement.reimbAuthor}</td>
				<td>${reimbursement.reimbStatusId}</td>
	            <td>
	            <button class='btn btn-success' onclick="approveDeny(${reimbursement.reimbId}, 'Approve'), afterUpdate()">Approve</button>
	            <button class='btn btn-danger' onclick="approveDeny(${reimbursement.reimbId}, 'Deny'), afterUpdate()">Deny</button>
	            </td>
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
    xhr.open('GET', '../viewAllRequests');

    // send the request
    xhr.send();
}
function retrieveApprovedTickets() {
    let xhr = new XMLHttpRequest();

    // on success callback function
    xhr.onload = function () {
        let reimbursements = JSON.parse(this.responseText);
        document.getElementsByClassName('allrequests-body')[0].innerHTML = ` `;
        reimbursements.forEach((reimbursement) => {
            if (reimbursement.reimbStatusId === "APPROVED") {
                document.getElementsByClassName('allrequests-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		        <td>${reimbursement.reimbType}</td>
				<td>$${reimbursement.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g, '$1,')}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${new Date(reimbursement.reimbSubmitted).toString().substring(4, 15)}</td>
				<td>${reimbursement.reimbAuthor}</td>
				<td>${reimbursement.reimbStatusId}</td>
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
    xhr.open('GET', '../viewAllRequests');

    // send the request
    xhr.send();
}
function retrieveDeniedTickets() {
    let xhr = new XMLHttpRequest();

    // on success callback function
    xhr.onload = function () {
        let reimbursements = JSON.parse(this.responseText);
        document.getElementsByClassName('allrequests-body')[0].innerHTML = ` `;
        reimbursements.forEach((reimbursement) => {
            if (reimbursement.reimbStatusId === "DENIED") {
                document.getElementsByClassName('allrequests-body')[0].innerHTML += `
			<tr id="${reimbursement.reimbId}">
		        <td>${reimbursement.reimbType}</td>
				<td>$${reimbursement.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g, '$1,')}</td>
				<td>${reimbursement.reimbDescription}</td>
				<td>${new Date(reimbursement.reimbSubmitted).toString().substring(4, 15)}</td>
				<td>${reimbursement.reimbAuthor}</td>
				<td>${reimbursement.reimbStatusId}</td>
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
    xhr.open('GET', '../viewAllRequests');

    // send the request
    xhr.send();
}