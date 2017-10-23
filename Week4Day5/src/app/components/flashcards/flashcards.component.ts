import { Component, Inject, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { FlashcardService } from '../../services/flashcard.service';

@Component({
  selector: 'app-flashcards',
  templateUrl: './flashcards.component.html'
})
export class FlashcardsComponent implements OnInit {
  public flashcards = [];
  public fieldFromService;

  constructor(private fcs: FlashcardService) {

  }

  ngOnInit() {
    this.fetch();
    this.fieldFromService = this.fcs.reusableField;
  }

  fetch(): void {
    this.fcs.getAllFlashcardsObservable().subscribe((resp) => {
      this.flashcards = resp.json();
    });
  }

}
