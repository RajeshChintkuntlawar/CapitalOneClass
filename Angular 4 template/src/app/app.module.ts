import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';


@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    NgbModule.forRoot(),
    NgbModule,
  ],
  declarations: [
    AppComponent,
    NavComponent,
   ],
  providers: [

   ],
  bootstrap: [AppComponent]
})
export class AppModule { }
