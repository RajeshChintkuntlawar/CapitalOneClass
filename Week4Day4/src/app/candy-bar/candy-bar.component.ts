import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-candy-bar',
  templateUrl: './candy-bar.component.html'
})
export class CandyBarComponent {

  @Input()
  private candy;

  constructor () {
    
  }

}
