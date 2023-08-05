import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  public itemsMenu=[
    {
      name:'Home',
      route:'home'
    },
    {
      name:'Register',
      route:'register'
    },
    {
      name:'ATM',
      route:'atm'
    }
  ]

}
