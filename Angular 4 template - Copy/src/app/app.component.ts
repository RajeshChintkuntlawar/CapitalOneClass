import { Component,  OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  private page: string;
  private paragraphClass = 'red';

  constructor() {
  }

  ngOnInit()  {
    // called after the constructor and called  after the first ngOnChanges()
    this.page = 'home';
  }

  goToAccounts() {
    this.page = 'accounts';
  }

  hide() {
    this.page = 'not accounts';
  }

  toggleColor() {
    if (this.paragraphClass === 'red') {
      this.paragraphClass = 'blue';
    } else {
      this.paragraphClass = 'red';
    }
  }

}
