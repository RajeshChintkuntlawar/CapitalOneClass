import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html'
})
export class EventBindingComponent {
  private counter = 0;

  private incrementCounter() {
    this.counter++;
  }
}
