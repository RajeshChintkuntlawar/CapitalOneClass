import { Routes } from '@angular/router';

import {InterpolationComponent} from './components/interpolation/interpolation.component';
import {EventBindingComponent} from './components/event-binding/event-binding.component';
import {PropertyBindingComponent} from './components/property-binding/property-binding.component';
import {PipesComponent} from './components/pipes/pipes.component';
import {StructuralDirectiveComponent} from './components/structural-directive/structural-directive.component';
import {TwoWayBindingComponent} from './components/two-way-binding/two-way-binding.component';

export const appRoutes: Routes = [
  {
    path: 'interpolation',
    component: InterpolationComponent
  },
  {
    path: 'event-bind',
    component: EventBindingComponent
  },
  {
    path: 'property-bind',
    component: PropertyBindingComponent
  },
  {
    path: 'pipes',
    component: PipesComponent
  },
  {
    path: 'structural-directives',
    component: StructuralDirectiveComponent
  },
  {
    path: 'two-way-binding',
    component: TwoWayBindingComponent
  },
  { path: '',
    redirectTo: '/interpolation',
    pathMatch: 'full'
  },
  { path: '**', component: InterpolationComponent }
];
