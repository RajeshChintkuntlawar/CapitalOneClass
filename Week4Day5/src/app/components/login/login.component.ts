import { Component, OnInit } from '@angular/core';
import { FlashcardService } from '../../services/flashcard.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent implements OnInit {
  public fromService;

  constructor(private fcs: FlashcardService) {

  }

  ngOnInit() {
    this.fromService = this.fcs.reusableField;
  }
}
