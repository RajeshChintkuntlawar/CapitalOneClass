import { Component,  OnInit } from '@angular/core';

@Component({
  selector: 'app-user-accounts',
  templateUrl: './user-accounts.component.html',
  styleUrls: ['./user-accounts.component.css']
})
export class UserAccountsComponent implements OnInit {
  private accounts;
  constructor() {
  }

  ngOnInit()  {
    // called after the constructor and called  after the first ngOnChanges()
    this.accounts = [
      {
        owner: 'Mehrab',
        balance: 5000
      }, {
        owner: 'Devi',
        balance: 1000000
      }, {
        owner: 'Surrender',
        balance: 50000000000
      }

    ]
  }

}
