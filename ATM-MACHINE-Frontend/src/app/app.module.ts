import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HeaderComponent } from './Template/header/header.component';
import { FooterComponent } from './Template/footer/footer.component';
import { HomeComponent } from './Pages/home/home.component';
import { RegisterComponent } from './Pages/register/register.component';
import { AtmComponent } from './Pages/atm/atm.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CardComponent } from './Pages/card/card.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    RegisterComponent,
    AtmComponent,
    CardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
