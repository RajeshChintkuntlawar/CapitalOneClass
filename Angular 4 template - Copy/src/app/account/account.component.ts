import { Component,  OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {
  @Input() account;

  constructor() {
  }

  ngOnInit()  {
    // called after the constructor and called  after the first ngOnChanges()
  }

  add100() {
    this.account.balance += 100;
  }
}
