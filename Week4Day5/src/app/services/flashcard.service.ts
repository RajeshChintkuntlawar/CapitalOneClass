import { Injectable, Inject } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Http } from '@angular/http';

@Injectable()
export class FlashcardService {
  public reusableField = 5;

  constructor( @Inject(Http) private http: Http) {

  }

  getAllFlashcardsObservable(): Observable<any> {
    return this.http.get('http://localhost:8080/ajax/flashcards');
  }
}
