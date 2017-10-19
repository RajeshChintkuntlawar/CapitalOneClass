import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';


// component imports
import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';
import {AccountComponent} from './account/account.component';
import {UserAccountsComponent} from './user-accounts/user-accounts.component';

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
    AccountComponent,
    UserAccountsComponent,
   ],
  providers: [

   ],
  bootstrap: [AppComponent]
})
export class AppModule { }
