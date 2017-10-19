import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-flashcard',
  templateUrl: './flashcard.component.html',
  styleUrls: ['flashcard.component.css']
})
export class FlashcardComponent {
  @Input()
  private flashcard;
  private display = false;

  toggleAnswer() {
    this.display = !this.display;
  }
}
