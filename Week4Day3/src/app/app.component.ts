import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
  yup: string;
  balance = 10;
  constructor() {
  }

  ngOnInit() {
    // called after the constructor and called  after the first ngOnChanges()
    this.yup = 'yes';
  }

  change() {
    this.yup = 'no';
  }

  add100() {
    this.balance += 10;
  }
}
