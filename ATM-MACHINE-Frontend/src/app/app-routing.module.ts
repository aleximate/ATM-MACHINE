import { NgModule } from '@angular/core';
import { Routes,RouterModule } from '@angular/router';
import { HomeComponent } from './Pages/home/home.component';
import { RegisterComponent } from './Pages/register/register.component';
import { AtmComponent } from './Pages/atm/atm.component';

const routes: Routes=[
  { path:'', redirectTo:'home', pathMatch: 'full'},
  { path:'home', component:HomeComponent},
  { path:'register', component:RegisterComponent},
  { path:'atm', component:AtmComponent}

]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
