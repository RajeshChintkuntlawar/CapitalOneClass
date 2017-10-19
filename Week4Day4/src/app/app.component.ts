import { Component,  OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  private candyBars = [
    {
      name: 'milkywhite',
      rating: 0
    },
    {
      name: 'kit-kat',
      rating: 10
    },
    {
      name: 'twix',
      rating: 6
    }
  ];

  private newBar = {
    name: '',
    rating: 0
  };

  private currentDate = new Date();

  constructor() {

  }

  ngOnInit()  {
    // called after the constructor and called  after the first ngOnChanges()
    setInterval(() => this.currentDate = new Date, 1000);
  }

  private addCandy() {
    this.candyBars.push(this.newBar);
    this.newBar = {
      name: '',
      rating: 0
    };
  }

}
