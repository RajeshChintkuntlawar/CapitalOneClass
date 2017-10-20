import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

// components
import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';
import {LoginComponent} from './components/login/login.component';
import {HomeComponent} from './components/home/home.component';
import {FlashcardsComponent} from './components/flashcards/flashcards.component';
import {ProfileComponent} from './components/profile/profile.component';

// services
import {FlashcardService} from './services/flashcard.service';


// states
import { appRoutes } from './routes';

@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    NgbModule.forRoot(),
    FormsModule,
    RouterModule.forRoot(appRoutes),
  ],
  declarations: [
    AppComponent,
    NavComponent,
    LoginComponent,
    HomeComponent,
    FlashcardsComponent,
    ProfileComponent,
   ],
  providers: [
    FlashcardService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
