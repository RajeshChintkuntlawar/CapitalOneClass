import { Routes } from '@angular/router';

// components
import {LoginComponent} from './components/login/login.component';
import {HomeComponent} from './components/home/home.component';
import {FlashcardsComponent} from './components/flashcards/flashcards.component';
import {ProfileComponent} from './components/profile/profile.component';

export const appRoutes: Routes = [
  {
    path: 'login',
    component: LoginComponent
  }, {
    path: 'home',
    component: HomeComponent,
    children: [
      {
        path: 'flashcards',
        component: FlashcardsComponent
      }, {
        path: 'profile',
        component: ProfileComponent
      }
    ]
  }
];
