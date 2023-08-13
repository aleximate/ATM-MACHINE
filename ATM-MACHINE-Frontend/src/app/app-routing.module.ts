import { NgModule } from '@angular/core';
import { Routes, RouterModule, CanActivateFn } from '@angular/router';
import { HomeComponent } from './Pages/home/home.component';
import { RegisterComponent } from './Pages/register/register.component';
import { AtmComponent } from './Pages/atm/atm.component';
import { CardComponent } from './Pages/card/card.component';
import { guardsGuard } from './Guards/guards.guard';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  {
    path: 'register',component:RegisterComponent,
    canActivateChild:[guardsGuard],
    children: [
      { path: 'card', component: CardComponent }],

  },
  { path: 'atm', component: AtmComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
