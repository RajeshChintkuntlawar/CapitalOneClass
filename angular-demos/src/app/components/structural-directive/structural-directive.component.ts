import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directive',
  templateUrl: './structural-directive.component.html'
})
export class StructuralDirectiveComponent {
  // not done yet
  private flashcards = [
    {
      question: 'question 1',
      answer: 'answer to q1',
      completed: false
    },
    {
      question: 'question 2',
      answer: 'answer to q2',
      completed: true
    },
    {
      question: 'question 3',
      answer: 'answer to q3',
      completed: false
    }
  ];

  private filterCompleted = false;

  private toggleCompleted() {
    this.filterCompleted = !this.filterCompleted;
  }
}
