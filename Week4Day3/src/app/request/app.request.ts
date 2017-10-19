import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-request',
  templateUrl: './app.request.html',
  styleUrls: ['./app.request.css']
})
export class RequestComponent implements OnInit {
  requestType: String;
  requestDetails: String;
  constructor() {
  }

  ngOnInit() {
    // called after the constructor and called  after the first ngOnChanges()
    this.requestType = 'Food Expense';
    this.requestDetails = 'Team Outing';
  }
}
