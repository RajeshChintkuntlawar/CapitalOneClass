// modules
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

// components
import {AppComponent} from './app.component';
import {NavComponent} from './components/nav/nav.component';
import {InterpolationComponent} from './components/interpolation/interpolation.component';
import {EventBindingComponent} from './components/event-binding/event-binding.component';
import {PropertyBindingComponent} from './components/property-binding/property-binding.component';
import {FlashcardComponent} from './components/flashcard/flashcard.component';
import {PipesComponent} from './components/pipes/pipes.component';
import {StructuralDirectiveComponent} from './components/structural-directive/structural-directive.component';
import {TwoWayBindingComponent} from './components/two-way-binding/two-way-binding.component';

// pipes
import {CompletedPipe} from './pipes/completed.pipe';


import {appRoutes} from './routes';

@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    NgbModule.forRoot(),
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  declarations: [
    // components
    AppComponent,
    NavComponent,
    InterpolationComponent,
    EventBindingComponent,
    PropertyBindingComponent,
    FlashcardComponent,
    PipesComponent,
    StructuralDirectiveComponent,
    TwoWayBindingComponent,

    // pipes
    CompletedPipe,
   ],
  providers: [

   ],
  bootstrap: [AppComponent]
})
export class AppModule { }
